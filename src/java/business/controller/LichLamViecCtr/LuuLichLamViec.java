
package business.controller.LichLamViecCtr;

import business.DAO.LichLamViecDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LichLamViec;


@WebServlet(name = "luuLichLamViec", urlPatterns = {"/LuuLichLamViec"})
public class LuuLichLamViec extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idTuan= Integer.parseInt(request.getSession().getAttribute("idTuan")+"");
        String ghiChu= request.getParameter("ghiChu");
        LichLamViecDAO lichLVDAO= new LichLamViecDAO();
        
        lichLVDAO.luuLenLich(idTuan,ghiChu);
        
        LichLamViec c = lichLVDAO.getLichLamViecByTuan(idTuan);
        request.setAttribute("lichLV", c);

        List<String> thuTrongTuan=new ArrayList<>();
        thuTrongTuan.add("Thứ 2"); thuTrongTuan.add("Thứ 3"); thuTrongTuan.add("Thứ 4"); thuTrongTuan.add("Thứ 5"); thuTrongTuan.add("Thứ 6"); thuTrongTuan.add("Thứ 7"); thuTrongTuan.add("Chủ nhật");
        request.setAttribute("listThu", thuTrongTuan);

        getServletContext().getRequestDispatcher("/gdLichLamViec.jsp").forward(request, response);
    }

}
