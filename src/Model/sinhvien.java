/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIT
 */
public class sinhvien {
    int SDT;
    String MaSinhVien,HoTen,NamSinh, QueQuan, GioiTinh,Email,Password;
    public sinhvien() {
    }

    public sinhvien(String MaSinhVien, String HoTen, String NamSinh, String QueQuan, String GioiTinh, String Email, int SDT) {
        this.MaSinhVien = MaSinhVien;
        this.SDT = SDT;
        this.HoTen = HoTen;
        this.QueQuan = QueQuan;
        this.GioiTinh = GioiTinh;
        this.Email = Email;
        this.NamSinh = NamSinh;
    }

    public sinhvien(String MaSinhVien, String HoTen, String NamSinh, String QueQuan, String GioiTinh, String Email,int SDT, String Password) {
        this.MaSinhVien = MaSinhVien;
        this.SDT = SDT;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.QueQuan = QueQuan;
        this.GioiTinh = GioiTinh;
        this.Email = Email;
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }
}
