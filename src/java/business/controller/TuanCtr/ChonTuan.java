/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.TuanCtr;

import business.DAO.TuanDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tuan;

@WebServlet(name = "ChonTuan", urlPatterns = {"/ChonTuan"})
public class ChonTuan extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Tuan> listTuan= new ArrayList<>();
        listTuan= new TuanDAO().getTuan();
        request.setAttribute("listTuan", listTuan);
        getServletContext().getRequestDispatcher("/gdChonTuan.jsp").forward(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        int idTuan= Integer.parseInt(request.getParameter("tuan"));
//        request.getSession().setAttribute("idTuan",idTuan);
////        getServletContext().getRequestDispatcher("/AddLichLamViec").include(request, response);
//        response.sendRedirect(request.getContextPath()+"/AddLichLamViec");
//    }


}
