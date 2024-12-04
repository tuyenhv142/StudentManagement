/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIT
 */
public class diem {
    String MaMonHoc,TenMon,MaSinhVien;
    int DiemCC,DiemGK,DiemCK;

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public int getDiemCC() {
        return DiemCC;
    }

    public void setDiemCC(int DiemCC) {
        this.DiemCC = DiemCC;
    }

    public int getDiemGK() {
        return DiemGK;
    }

    public void setDiemGK(int DiemGK) {
        this.DiemGK = DiemGK;
    }

    public int getDiemCK() {
        return DiemCK;
    }

    public void setDiemCK(int DiemCK) {
        this.DiemCK = DiemCK;
    }

    public diem(String MaMonHoc, String TenMon, int DiemCC, int DiemGK, int DiemCK, String MaSinhVien) {
        this.MaMonHoc = MaMonHoc;
        this.TenMon = TenMon;
        this.MaSinhVien = MaSinhVien;
        this.DiemCC = DiemCC;
        this.DiemGK = DiemGK;
        this.DiemCK = DiemCK;
    }

    public diem(String MaMonHoc, String TenMon, int DiemCC, int DiemGK, int DiemCK) {
        this.MaMonHoc = MaMonHoc;
        this.TenMon = TenMon;
        this.DiemCC = DiemCC;
        this.DiemGK = DiemGK;
        this.DiemCK = DiemCK;
    }

    public diem() {
    }
}
