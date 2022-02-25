/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO;

import bussiness.JDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import model.CaLamViec;
import model.NVTrongCoi;
import model.NhanVien;

/**
 *
 * @author myduy
 */
public class NVTrongCoiDAO {
    public NVTrongCoi getNVTrongCoiByID(int id) {
        NVTrongCoi c=null;
        String sql = "Select * from tblthanhvien,tblnhanvien,tblnvtrongcoi where tblthanhvien.id=tblnhanvien.idnhanvien\n" +
"and tblnhanvien.idnhanvien=tblnvtrongcoi.idNVTrongCoi and tblnvtrongcoi.idNVTrongCoi=?;";
        Connection connection=JDBC.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()) {             
                int ID = resultSet.getInt("id");
                String ten=resultSet.getString("ten");
                String username= resultSet.getString("username");
                String password = resultSet.getString("password");
                Date ngaySinh= resultSet.getDate("ngaysinh");
                String diaChi= resultSet.getString("diaChi");
                String email= resultSet.getString("email");
                String SDT= resultSet.getString("sdt");
                String viTri= resultSet.getString("vitri");
                c= new NVTrongCoi(viTri, ID, ten, username, password, ngaySinh, diaChi, email, SDT);
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi lay NV"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return c;
    }
    public List<NVTrongCoi> getNVTrongCoiByTen(String ten) {
        List<NVTrongCoi> list=new ArrayList<>();
        
        String sql = "Select * from tblthanhvien,tblnhanvien,tblnvtrongcoi where tblthanhvien.id=tblnhanvien.idnhanvien\n" +
"and tblnhanvien.idnhanvien=tblnvtrongcoi.idNVTrongCoi and tblthanhvien.ten LIKE '%"+ten+"%'";
        Connection connection=JDBC.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
//            preparedStatement.setString(1," %"+ten+"% ");
            
            ResultSet resultSet= preparedStatement.executeQuery();

            while (resultSet.next()) {  

                int ID = resultSet.getInt("ID");
                String ten1=resultSet.getString("ten");
                String username= resultSet.getString("username");
                String password = resultSet.getString("password");
                Date ngaySinh= resultSet.getDate("ngaySinh");
                String diaChi= resultSet.getString("diaChi");
                String email= resultSet.getString("email");
                String SDT= resultSet.getString("SDT");
                String viTri= resultSet.getString("vitri");
                
                list.add(new NVTrongCoi(viTri, ID, ten1, username, password, ngaySinh, diaChi, email, SDT));
                
            }
        } catch (Exception e) {
            System.out.println("Loi lay NV"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return list;
    }
}
