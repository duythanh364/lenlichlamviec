
package model;

import java.util.List;


public class LichLamViec {

    private int ID;
    private String ghiChu;
    private Tuan tuan;
    private List<LichDangKy> dsLichDangKy;

    public LichLamViec(int ID, String ghiChu, Tuan tuan, List<LichDangKy> dsLichDangKy) {
        this.ID = ID;
        this.ghiChu = ghiChu;
        this.tuan = tuan;
        this.dsLichDangKy = dsLichDangKy;
    }

    public LichLamViec(String ghiChu, Tuan tuan, List<LichDangKy> dsLichDangKy) {

        this.ghiChu = ghiChu;
        this.tuan = tuan;
        this.dsLichDangKy = dsLichDangKy;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Tuan getTuan() {
        return tuan;
    }

    public void setTuan(Tuan tuan) {
        this.tuan = tuan;
    }

    public List<LichDangKy> getDsLichDangKy() {
        return dsLichDangKy;
    }

    public void setDsLichDangKy(List<LichDangKy> dsLichDangKy) {
        this.dsLichDangKy = dsLichDangKy;
    }

}
