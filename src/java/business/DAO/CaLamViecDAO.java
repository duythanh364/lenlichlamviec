/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.DAO;

import bussiness.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import model.CaLamViec;
import model.LichDangKy;
import model.LichLamViec;
import model.Tuan;

/**
 *
 * @author myduythanh_hocviencongnghebuuch
 */
public class CaLamViecDAO {
    public CaLamViec getCaLamViecByID(int id) {
        CaLamViec c=null;
        String sql = "Select * from tblcalamviec where id=?";
        Connection connection=JDBC.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()) {             
                int ID = resultSet.getInt("id");
                Time start= resultSet.getTime("gioBatDau");
                Time end= resultSet.getTime("gioKetThuc");
                String ngay=resultSet.getString("ngay");
                c = new CaLamViec(ID,start,end,ngay);
            }
        } catch (Exception e) {
            System.out.println("Loi lay CLV"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return c;
    }
    public CaLamViec getCaLamViecByGioVaNgay(String ngay, String gio) {
        CaLamViec c=null;
        String sql = "Select * from tblcalamviec where gioBatDau=? and ngay=?";
        Connection connection=JDBC.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,gio);
            preparedStatement.setString(2,ngay);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()) {             
                int ID = resultSet.getInt("id");
                Time start= resultSet.getTime("gioBatDau");
                Time end= resultSet.getTime("gioKetThuc");
                String ngayy=resultSet.getString("ngay");
                c = new CaLamViec(ID,start,end,ngayy);
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi lay CLV"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return c;
    }
}
