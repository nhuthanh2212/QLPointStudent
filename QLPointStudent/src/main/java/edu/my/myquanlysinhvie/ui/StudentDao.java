
package edu.my.myquanlysinhvie.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDao {
    public static List<Student> lsS = new ArrayList<>();

    public StudentDao() {
   
    }
    
    public int add(Student s){
        lsS.add(s);
        return 1;
    }
    public int count(){
        return lsS.size();
    }
    public Student findByID(String MaSinhVien){
        for (Student student : lsS) {
            if(student.getMaSinhVien().equalsIgnoreCase(MaSinhVien)){
                return  student;
            }
        }
        return null;
    }
    public int edit(Student s){
        for (Student student : lsS) {
            if(student.getMaSinhVien().equalsIgnoreCase(s.getMaSinhVien())){
                student.setHoTen(s.getHoTen());
                student.setEmail(s.getEmail());
                student.setSoDT(s.getSoDT());
                student.setGioiTinh(s.isGioiTinh());
                student.setDiaChi(s.getDiaChi());
                student.setHinhAnh(s.getHinhAnh());
                return 1;
            }
        }
        return -1;
    }
    public int del(String MaSinhVien){
        Student s = findByID(MaSinhVien);
        if(s != null){
            lsS.remove(s);
            return 1;
        }
        return -1;
    }
    public Student getoneStudentAtPosition(int Pos){
        return lsS.get(Pos);
    }
    public List<Student> getAllStudent(){
        return lsS;
    }
     public void sortByName() {
        Collections.sort(lsS, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getHoTen().compareTo(o2.getHoTen()));
            }
            
        });
    }
}
