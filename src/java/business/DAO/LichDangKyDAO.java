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
import model.NVTrongCoi;
import model.Tuan;

/**
 *
 * @author myduythanh
 */
public class LichDangKyDAO {

    public List<LichDangKy> getLichDangKyTheoTuan(int idTuan) {
        List<LichDangKy> listDK = new ArrayList<>();
        String sql = "Select * from tbllichdangky where idTuan=?";
        Connection connection = JDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idTuan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("id");
                String ghiChu = resultSet.getString("ghiChu");
                Boolean trangThaiTamThoi = resultSet.getBoolean("trangThaiTamThoi");
                int idCaLamViec = resultSet.getInt("idCaLamViec");
                int idNVTrongCoi = resultSet.getInt("idNVTrongCoi");
                CaLamViec clv = new CaLamViecDAO().getCaLamViecByID(idCaLamViec);
                NVTrongCoi nv = new NVTrongCoiDAO().getNVTrongCoiByID(idNVTrongCoi);
                Tuan t = new TuanDAO().getTuanByID(idTuan);
                LichDangKy l = new LichDangKy(ID, ghiChu, trangThaiTamThoi, t, clv, nv);
                listDK.add(l);
            }
        } catch (Exception e) {
            System.out.println("Loi lay tat ca cac lich dang ky theo tuan ");
        } finally {
            JDBC.closeConnection();
        }
        return listDK;
    }


    public List<LichDangKy> getLichDangKyChuaDuocChonTheoCaVaTuan(int idTuan, int idCa) {
        List<LichDangKy> listDK = new ArrayList<>();
        String sql = "SELECT kytucxa.tbllichdangky.* FROM kytucxa.tbllichdangky where \n"
                + "                tbllichdangky.idCaLamViec=? and \n"
                + "                tbllichdangky.idTuan=? and \n"
                + "                tbllichdangky.trangThaiTamThoi=0;";
        Connection connection = JDBC.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, idCa);
            preparedStatement.setInt(2, idTuan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                int ID = resultSet.getInt("id");
                String ghiChu = resultSet.getString("ghiChu");
                Boolean trangThaiTamThoi = resultSet.getBoolean("trangThaiTamThoi");
                int idCaLamViec = resultSet.getInt("idCaLamViec");
                int idNVTrongCoi = resultSet.getInt("idNVTrongCoi");
                CaLamViec clv = new CaLamViecDAO().getCaLamViecByID(idCaLamViec);
                NVTrongCoi nv = new NVTrongCoiDAO().getNVTrongCoiByID(idNVTrongCoi);
                Tuan t = new TuanDAO().getTuanByID(idTuan);
                LichDangKy l = new LichDangKy(ID, ghiChu, trangThaiTamThoi, t, clv, nv);
                listDK.add(l);
            }
        } catch (Exception e) {
            System.out.println("Loi lay tat ca cac lich dang ky chua dc chon theo ca ");
        } finally {
            JDBC.closeConnection();
        }
        return listDK;
    }

    public List<LichDangKy> getLichDangKyVuaDuocChonTheoTuan(int idTuan) {
        List<LichDangKy> listDK = new ArrayList<>();
        String sql = "SELECT kytucxa.tbllichdangky.* FROM kytucxa.tbllichdangky where \n"
                //                + "tbllichdangky.idTuan=tbllichlamviec.idTuan and \n"
                //                + " not tbllichdangky.idLichLamViec <=> tbllichlamviec.id and \n"
                + "tbllichdangky.idTuan=? and \n"
                + "tbllichdangky.trangThaiTamThoi=1";
        Connection connection = JDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, idTuan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("id");
                String ghiChu = resultSet.getString("ghiChu");
                Boolean trangThaiTamThoi = resultSet.getBoolean("trangThaiTamThoi");
                int idCaLamViec = resultSet.getInt("idCaLamViec");
                int idNVTrongCoi = resultSet.getInt("idNVTrongCoi");
                CaLamViec clv = new CaLamViecDAO().getCaLamViecByID(idCaLamViec);
                NVTrongCoi nv = new NVTrongCoiDAO().getNVTrongCoiByID(idNVTrongCoi);
                Tuan t = new TuanDAO().getTuanByID(idTuan);
                LichDangKy l = new LichDangKy(ID, ghiChu, trangThaiTamThoi, t, clv, nv);
                listDK.add(l);
            }
        } catch (Exception e) {
            System.out.println("Loi lay tat ca cac lich dang ky vua dc chon theo ca ");
        } finally {
            JDBC.closeConnection();
        }
        return listDK;
    }

    public List<LichDangKy> getLichDangKyDaDuocChonTheoTuan(int idTuan) {
        List<LichDangKy> listDK = new ArrayList<>();
        String sql = "SELECT kytucxa.tbllichdangky.* FROM kytucxa.tbllichdangky,tbllichlamviec where \n"
                + "tbllichdangky.idTuan=tbllichlamviec.idTuan and \n"
                + "tbllichdangky.idLichLamViec <=> tbllichlamviec.id and \n"
                + "tbllichdangky.idTuan=? \n";
        Connection connection = JDBC.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, idTuan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("id");
                String ghiChu = resultSet.getString("ghiChu");
                Boolean trangThaiTamThoi = resultSet.getBoolean("trangThaiTamThoi");
                int idCaLamViec = resultSet.getInt("idCaLamViec");
                int idNVTrongCoi = resultSet.getInt("idNVTrongCoi");
                CaLamViec clv = new CaLamViecDAO().getCaLamViecByID(idCaLamViec);
                NVTrongCoi nv = new NVTrongCoiDAO().getNVTrongCoiByID(idNVTrongCoi);
                Tuan t = new TuanDAO().getTuanByID(idTuan);
                LichDangKy l = new LichDangKy(ID, ghiChu, trangThaiTamThoi, t, clv, nv);
                listDK.add(l);
            }
        } catch (Exception e) {
            System.out.println("Loi lay tat ca cac lich dang ky da dc chon theo ca ");
        } finally {
            JDBC.closeConnection();
        }
        return listDK;
    }

    public void updateTrangThaiLichDK(String[] ids, String ngay, String gio, int idTuan) {

        String sql = "UPDATE  tbllichdangky SET trangThaiTamThoi=1 WHERE idTuan=? and idCaLamViec= ? and idNVTrongCoi= ?";
        String sql2 = "Select * from tblcalamviec where gioBatDau=? and ngay=?";
        String sql3 = "Insert into tbllichdangky(trangThaiTamThoi,idTuan,idCaLamViec,idNVTrongCoi) values(1,?,?,?)";
        Connection connection = JDBC.getConnection();
        int idCa = 0;
        int count = 0;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, gio);
            preparedStatement.setString(2, ngay);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                idCa = resultSet.getInt("id");
                break;
            }

            List<LichDangKy> list = new ArrayList<>();
            list = getLichDangKyChuaDuocChonTheoCaVaTuan(idTuan, idCa);
            // cap nhat nhan vien
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
            for (String id : ids) {
                for (LichDangKy l : list) {
                    if (l.getNhanVien().getID() == Integer.parseInt(id)) {
                        preparedStatement2.setInt(1, idTuan);
                        preparedStatement2.setInt(2, idCa);
                        preparedStatement2.setInt(3, Integer.parseInt(id));
                        preparedStatement2.executeUpdate();
                        count++;
                    }
                }
            }
            if (count == 0) {
                PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
                for (String id : ids) {
                    preparedStatement3.setInt(1, idTuan);
                    preparedStatement3.setInt(2, idCa);
                    preparedStatement3.setInt(3, Integer.parseInt(id));
                    preparedStatement3.executeUpdate();
                }
            }
        } catch (Exception e) {
            System.out.println("Update lich dang ky loi");
            e.printStackTrace();
        } finally {
            JDBC.closeConnection();

        }
    }

//    public List<LichDangKy> getLichDangKyChuaDuocChonTheoTuan(int idTuan) {
//        List<LichDangKy> listDK = new ArrayList<>();
//        String sql = "SELECT kytucxa.tbllichdangky.* FROM kytucxa.tbllichdangky where \n"
//                + "                tbllichdangky.idTuan=? and \n"
//                + "                tbllichdangky.trangThaiTamThoi=0;";
//        Connection connection = JDBC.getConnection();
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setInt(1, idTuan);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//
//                int ID = resultSet.getInt("id");
//                String ghiChu = resultSet.getString("ghiChu");
//                Boolean trangThaiTamThoi = resultSet.getBoolean("trangThaiTamThoi");
//                int idCaLamViec = resultSet.getInt("idCaLamViec");
//                int idNVTrongCoi = resultSet.getInt("idNVTrongCoi");
//                CaLamViec clv = new CaLamViecDAO().getCaLamViecByID(idCaLamViec);
//                NVTrongCoi nv = new NVTrongCoiDAO().getNVTrongCoiByID(idNVTrongCoi);
//                Tuan t = new TuanDAO().getTuanByID(idTuan);
//                LichDangKy l = new LichDangKy(ID, ghiChu, trangThaiTamThoi, t, clv, nv);
//                listDK.add(l);
//            }
//        } catch (Exception e) {
//            System.out.println("Loi lay tat ca cac lich dang ky chua dc chon theo tuan ");
//        } finally {
//            JDBC.closeConnection();
//        }
//        return listDK;
//    }
}
