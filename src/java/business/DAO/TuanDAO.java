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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Tuan;

/**
 *
 * @author myduy
 */
public class TuanDAO {
    
    public List<Tuan> getTuan() {
        List<Tuan> listTuan = new ArrayList<>();
        String sql = "Select *from tbltuan";
        Connection connection=JDBC.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery(sql);
            while (resultSet.next()) {             
                int ID = resultSet.getInt("id");
                Date ngayBatDau= resultSet.getDate("ngayBatDau");
                Date ngayKetThuc= resultSet.getDate("ngayKetThuc");
                int stt= resultSet.getInt("soThuTu");
                Tuan c = new Tuan(ID, ngayBatDau, ngayKetThuc, stt);
                listTuan.add(c);             
            }
        } catch (Exception e) {
            System.out.println("Loi lay tat ca cac tuan"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return listTuan;
    }
    public Tuan getTuanByID(int id) {
        Tuan c=null;
        String sql = "Select * from tbltuan where id=?";
        Connection connection=JDBC.getConnection();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()) {             
                int ID = resultSet.getInt("id");
                Date ngayBatDau= resultSet.getDate("ngayBatDau");
                Date ngayKetThuc= resultSet.getDate("ngayKetThuc");
                int stt= resultSet.getInt("soThuTu");
                c = new Tuan(ID, ngayBatDau, ngayKetThuc, stt);
            }
        } catch (Exception e) {
            System.out.println("Loi lay tuan"); 
        }
        finally{
            JDBC.closeConnection();
        }       
        return c;
    }
}
