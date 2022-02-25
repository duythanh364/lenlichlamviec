/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author myduy
 */
public class LichDangKy {
    private int ID;
    private String ghiChu;
    private Boolean trangThaiTamThoi;
    private Tuan tuan;
    private CaLamViec caLamViec;
    private NVTrongCoi nhanVien;

    public LichDangKy(int ID, String ghiChu, Boolean trangThaiTamThoi, Tuan tuan, CaLamViec caLamViec, NVTrongCoi nhanVien) {
        this.ID = ID;
        this.ghiChu = ghiChu;
        this.trangThaiTamThoi = trangThaiTamThoi;
        this.tuan = tuan;
        this.caLamViec = caLamViec;
        this.nhanVien = nhanVien;
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

    public Boolean getTrangThaiTamThoi() {
        return trangThaiTamThoi;
    }

    public void setTrangThaiTamThoi(Boolean trangThaiTamThoi) {
        this.trangThaiTamThoi = trangThaiTamThoi;
    }

    public Tuan getTuan() {
        return tuan;
    }

    public void setTuan(Tuan tuan) {
        this.tuan = tuan;
    }

    public CaLamViec getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(CaLamViec caLamViec) {
        this.caLamViec = caLamViec;
    }

    public NVTrongCoi getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NVTrongCoi nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LichDangKy){
            LichDangKy l = (LichDangKy) obj;
            return this.ID== l.ID;
        }
        return false;
    }
    
}
