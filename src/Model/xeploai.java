/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIT
 */
public class xeploai {
    String MaXepLoai,MaSinhVien, HocKy,NamHoc,XepLoai;

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHocKy() {
        return HocKy;
    }

    public void setHocKy(String HocKy) {
        this.HocKy = HocKy;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    public String getXepLoai() {
        return XepLoai;
    }

    public void setXepLoai(String XepLoai) {
        this.XepLoai = XepLoai;
    }

    public String getMaXepLoai() {
        return MaXepLoai;
    }

    public void setMaXepLoai(String MaXepLoai) {
        this.MaXepLoai = MaXepLoai;
    }

    public xeploai(String MaXepLoai, String MaSinhVien, String HocKy, String NamHoc, String XepLoai) {
        this.MaXepLoai = MaXepLoai;
        this.MaSinhVien = MaSinhVien;
        this.HocKy = HocKy;
        this.NamHoc = NamHoc;
        this.XepLoai = XepLoai;
    }


    public xeploai() {
    }
}
