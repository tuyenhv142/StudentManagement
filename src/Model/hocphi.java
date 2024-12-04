/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIT
 */
public class hocphi {
    int  TongTien;
    String MaHocPhi, TrangThai, MaSinhVien,HocKi, NamHoc;

    public hocphi() {
    }

    public hocphi(String MaHocPhi, String HocKi, String NamHoc, int TongTien, String TrangThai, String MaSinhVien) {
        this.MaHocPhi = MaHocPhi;
        this.HocKi = HocKi;
        this.NamHoc = NamHoc;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
        this.MaSinhVien = MaSinhVien;
    }

    public hocphi(String MaHocPhi, String HocKi, String NamHoc, int TongTien, String TrangThai) {
        this.TongTien = TongTien;
        this.MaHocPhi = MaHocPhi;
        this.TrangThai = TrangThai;
        this.HocKi = HocKi;
        this.NamHoc = NamHoc;
    }
   
    public String getMaHocPhi() {
        return MaHocPhi;
    }

    public void setMaHocPhi(String MaHocPhi) {
        this.MaHocPhi = MaHocPhi;
    }

    public String getHocKi() {
        return HocKi;
    }

    public void setHocKi(String HocKi) {
        this.HocKi = HocKi;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }
    
}
