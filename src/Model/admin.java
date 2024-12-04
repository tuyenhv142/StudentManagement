/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MIT
 */
public class admin {
    String Username, Password,Quyen, HoTen, Email;
    int Id;

    public admin() {
    }

    public admin(String Username, String Password, String Quyen, String HoTen, String Email, int Id) {
        this.Username = Username;
        this.Password = Password;
        this.Quyen = Quyen;
        this.HoTen = HoTen;
        this.Email = Email;
        this.Id = Id;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public admin(String Username, String Password, String Quyen, String HoTen, String Email) {
        this.Username = Username;
        this.Password = Password;
        this.Quyen = Quyen;
        this.HoTen = HoTen;
        this.Email = Email;
    }
    
}
