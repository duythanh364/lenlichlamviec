package business.controller.LichDangKyCtr;

import business.DAO.CaLamViecDAO;
import business.DAO.LichDangKyDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CaLamViec;
import model.LichDangKy;

@WebServlet(name = "listLichDangKy", urlPatterns = {"/listLichDangKy"})
public class ListLichDangKy extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s = request.getParameter("ca");
        request.getSession().setAttribute("ca", s);
        String ca[] = s.split("-");

        CaLamViec c = new CaLamViecDAO().getCaLamViecByGioVaNgay(ca[0], ca[1]);
        LichDangKyDAO dkDAO = new LichDangKyDAO();
        List<LichDangKy> list = new ArrayList<>();
        int idTuan = Integer.parseInt(request.getSession().getAttribute("idTuan") + "");

        list = dkDAO.getLichDangKyChuaDuocChonTheoCaVaTuan(idTuan, c.getID());

        List<LichDangKy> listDaChon = dkDAO.getLichDangKyVuaDuocChonTheoTuan(idTuan);
        Map<Integer, Integer> map = new HashMap<>(); // map tong gio
        for (LichDangKy l : list) {
            // neu nhan vien da tung dc chon o ca khac
            for (LichDangKy dk : listDaChon) {
                if (dk.getNhanVien().getID() == l.getNhanVien().getID()) {
                    if (map.containsKey(l.getNhanVien().getID())) {
                        if (dk.getCaLamViec().getGioBatDau().equals("08:00:00")) {
                            map.put(dk.getNhanVien().getID(), map.get(dk.getNhanVien().getID()) + 4);
                        } else if (dk.getCaLamViec().getGioBatDau().equals("12:00:00")) {
                            map.put(dk.getNhanVien().getID(), map.get(dk.getNhanVien().getID()) + 7);
                        } else if (dk.getCaLamViec().getGioBatDau().equals("19:00:00")) {
                            map.put(dk.getNhanVien().getID(), map.get(dk.getNhanVien().getID()) + 13);
                        }
                    } else {
                        if (dk.getCaLamViec().getGioBatDau().equals("08:00:00")) {
                            map.put(dk.getNhanVien().getID(), 4);
                        } else if (dk.getCaLamViec().getGioBatDau().equals("12:00:00")) {
                            map.put(dk.getNhanVien().getID(), 7);
                        } else if (dk.getCaLamViec().getGioBatDau().equals("19:00:00")) {
                            map.put(dk.getNhanVien().getID(), 13);
                        }
                    }
                }
            }
            if (map.get(l.getNhanVien().getID()) == null) {
                map.put(l.getNhanVien().getID(), 0);
            }
        }

        request.setAttribute("listDK", list);
        request.setAttribute("mapTongGio", map);
        getServletContext().getRequestDispatcher("/gdThemNhanVienVaoCaLam.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] ids = request.getParameterValues("options");
        // giong get
        String s = (String) request.getSession().getAttribute("ca");
        String ca[] = s.split("-");
        int idTuan = Integer.parseInt(request.getSession().getAttribute("idTuan") + "");

        LichDangKyDAO dkDAO = new LichDangKyDAO();
        dkDAO.updateTrangThaiLichDK(ids, ca[0], ca[1], idTuan);
        
        // gui ve trang cu
        List<LichDangKy> listDK =dkDAO.getLichDangKyTheoTuan(idTuan);
        List<LichDangKy> listDKVuaChon =dkDAO.getLichDangKyVuaDuocChonTheoTuan(idTuan);
        request.setAttribute("listDK", listDK);
        request.setAttribute("listDKVuaChon", listDKVuaChon);

        List<String> thuTrongTuan = new ArrayList<>(); thuTrongTuan.add("Thứ 2"); thuTrongTuan.add("Thứ 3"); thuTrongTuan.add("Thứ 4"); thuTrongTuan.add("Thứ 5"); thuTrongTuan.add("Thứ 6"); thuTrongTuan.add("Thứ 7"); thuTrongTuan.add("Chủ nhật");
        request.setAttribute("listThu", thuTrongTuan);

        getServletContext().getRequestDispatcher("/gdLenLich.jsp").forward(request, response);
//        getServletContext().getRequestDispatcher("/AddLichLamViec").forward(request, response);
    }
}
