
package edu.my.myquanlysinhvie.ui;


public class Student {
    private String MaSinhVien;
    private String HoTen;
    private String Email; 
    private String SoDT;
    private String DiaChi;
    private boolean GioiTinh;
    private String HinhAnh;

    public Student() {
    }

    public Student(String MaSinhVien, String HoTen) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
    }

    

    public Student(String MaSinhVien, String HoTen, String Email, String SoDT, String DiaChi, boolean GioiTinh, String HinhAnh) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.Email = Email;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.HinhAnh = HinhAnh;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
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

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }



   
}
