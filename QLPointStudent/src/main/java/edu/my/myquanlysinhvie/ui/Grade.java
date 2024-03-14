package edu.my.myquanlysinhvie.ui;




public class Grade {
    private int MaSinhVien;
    private String HoTen;
    private Student st;
    private double LapTrinhCoSo, cSDL, fC1;

    public Grade() {
    }

    public Grade(int MaSinhVien, String HoTen, Student st, double LapTrinhCoSo, double cSDL, double fC1) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.st = st;
        this.LapTrinhCoSo = LapTrinhCoSo;
        this.cSDL = cSDL;
        this.fC1 = fC1;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public double getLapTrinhCoSo() {
        return LapTrinhCoSo;
    }

    public void setLapTrinhCoSo(double LapTrinhCoSo) {
        this.LapTrinhCoSo = LapTrinhCoSo;
    }

    public double getcSDL() {
        return cSDL;
    }

    public void setcSDL(double cSDL) {
        this.cSDL = cSDL;
    }

    public double getfC1() {
        return fC1;
    }

    public void setfC1(double fC1) {
        this.fC1 = fC1;
    }

   
    public double getTBC(){
        double diemtbc=0;
        return diemtbc=(getLapTrinhCoSo()+getcSDL()+getfC1())/3;
    }
    public String getXepLoai(){
        String xl = "";
        double tbc = getTBC();
        if(tbc>8){
            xl = "GIỎI";
        }else if(tbc>=7){
            xl = "KHÁ";
        }else if(tbc>=5){
            xl = "TRUNG BÌNH";
        }else{
            xl = "YẾU";
        }
        return xl;
    }

   
  
    
    
    
}
