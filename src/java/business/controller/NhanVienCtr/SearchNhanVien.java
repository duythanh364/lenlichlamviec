
package business.controller.NhanVienCtr;

import business.DAO.CaLamViecDAO;
import business.DAO.LichDangKyDAO;
import business.DAO.NVTrongCoiDAO;
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
import model.NVTrongCoi;
import model.NhanVien;


@WebServlet(name = "SearchNhanVien", urlPatterns = {"/SearchNhanVien"})
public class SearchNhanVien extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/gdTimKiemNV.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ten= request.getParameter("tenNV");
        List<NVTrongCoi> listTK = new ArrayList<>();
        listTK=new NVTrongCoiDAO().getNVTrongCoiByTen(ten);

        
        LichDangKyDAO dkDAO = new LichDangKyDAO();
        List<LichDangKy> list = new ArrayList<>();
        int idTuan = Integer.parseInt(request.getSession().getAttribute("idTuan") + "");    
       
        List<LichDangKy> listDaChon = dkDAO.getLichDangKyVuaDuocChonTheoTuan(idTuan);

        Map<Integer, Integer> map = new HashMap<>(); // map tong gio
        for (NVTrongCoi l : listTK) {
            // neu da dc chon
            for (LichDangKy dk : listDaChon) {
                if (dk.getNhanVien().getID() == l.getID()) {
                    if (map.containsKey(l.getID())) {
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
            if (map.get(l.getID()) == null) {
                map.put(l.getID(), 0);
            }
        }
        request.setAttribute("listDK", listTK);
        request.setAttribute("mapTongGio", map);
        getServletContext().getRequestDispatcher("/gdTimKiemNV.jsp").forward(request, response);
    }
}
