
package business.controller.LichLamViecCtr;

import business.DAO.LichDangKyDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LichDangKy;

@WebServlet(name = "AddLichLamViec", urlPatterns = {"/AddLichLamViec"})
public class AddLichLamViec extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idTuan= Integer.parseInt(request.getParameter("tuan"));
        request.getSession().setAttribute("idTuan",idTuan);
        LichDangKyDAO dkDAO= new LichDangKyDAO();
      
        // hien thi 
        List<LichDangKy> listDK = new ArrayList<>();
        listDK= new LichDangKyDAO().getLichDangKyTheoTuan(idTuan);

        request.setAttribute("listDK", listDK);

        List<String> thuTrongTuan=new ArrayList<>();
        thuTrongTuan.add("Thứ 2"); thuTrongTuan.add("Thứ 3"); thuTrongTuan.add("Thứ 4"); thuTrongTuan.add("Thứ 5"); thuTrongTuan.add("Thứ 6"); thuTrongTuan.add("Thứ 7"); thuTrongTuan.add("Chủ nhật");
        request.setAttribute("listThu", thuTrongTuan);

        getServletContext().getRequestDispatcher("/gdLenLich.jsp").forward(request, response);
    }
}
