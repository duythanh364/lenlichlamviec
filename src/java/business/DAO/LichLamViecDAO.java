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
 * @author myduy
 */
public class LichLamViecDAO {

    public LichLamViec getLichLamViecByTuan(int id) {
        String sql = "Select * from tbllichlamviec where idTuan=?";
        Connection connection = JDBC.getConnection();
        LichLamViec c = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("id");
                String ghiChu = resultSet.getString("ghiChu");
                int idTuan = resultSet.getInt("idTuan");
                Tuan t = new TuanDAO().getTuanByID(idTuan);
                List<LichDangKy> l = new LichDangKyDAO().getLichDangKyDaDuocChonTheoTuan(idTuan);
                c = new LichLamViec(ID, ghiChu, t, l);
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi lay LLV");
        } finally {
            JDBC.closeConnection();
        }
        return c;
    }

    public void luuLenLich(int idTuan, String ghiChu) {
        String sql = "INSERT INTO  tbllichlamviec(ghiChu,idTuan) values(?,?) ";
        String sql2 = "UPDATE  tbllichdangky SET idLichLamViec=? WHERE id=?";
        String sql3 = "UPDATE  tbllichdangky SET trangThaiTamThoi=0";

        Connection connection = JDBC.getConnection();
        int row = -1;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ghiChu);
            preparedStatement.setInt(2, idTuan);
            preparedStatement.executeUpdate();

            LichLamViec c = getLichLamViecByTuan(idTuan);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
            List<LichDangKy> list = new LichDangKyDAO().getLichDangKyVuaDuocChonTheoTuan(idTuan);
            for (LichDangKy l : list) {
                preparedStatement2.setInt(1, c.getID());
                preparedStatement2.setInt(2, l.getID());
                preparedStatement2.executeUpdate();
            }

            PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
            preparedStatement3.executeUpdate();

        } catch (Exception e) {
            System.out.println("loi luu len lich");
            e.printStackTrace();
        } finally {
            JDBC.closeConnection();

        }
    }
}
