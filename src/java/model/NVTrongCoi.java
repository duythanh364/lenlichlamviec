/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author myduy
 */
public class NVTrongCoi extends NhanVien {

    public NVTrongCoi(String viTri, int ID, String ten, String username, String password, Date ngaySinh, String diaChi, String email, String SDT) {
        super(viTri, ID, ten, username, password, ngaySinh, diaChi, email, SDT);
    }
    
}
