
package edu.my.myquanlysinhvie.ui;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GradeDAO {
    List<Grade> ls = new ArrayList<>();
    public int add(Grade d){
        ls.add(d);
        return 1;
    }
    public List<Grade> getAllGrade(){
        return ls;
    }
    public Grade getOneGradeByMaSV(String MaSinhVien){
        for (Grade d : ls) {
            if(d.getSt().getMaSinhVien().equalsIgnoreCase(MaSinhVien)){
                return d;
            }
        }
        return null;
    }
    public int updateGrade(Grade dNew){
        for (Grade d : ls) {
            if(d.getSt().getMaSinhVien().equalsIgnoreCase(dNew.getSt().getMaSinhVien())){
                d.setLapTrinhCoSo(dNew.getLapTrinhCoSo());
                d.setcSDL(dNew.getcSDL());
                d.setfC1(dNew.getfC1());
                return 1;
            }
        }
        return -1;
    }
    public int delGrade(String MaSinhVien){
        Grade d = getOneGradeByMaSV(MaSinhVien);
        if(d!= null){
            ls.remove(d);
            return 1;
        }
        return -1;
    }
    public void sortByName() {
        Collections.sort(ls, new Comparator<Grade>(){
            @Override
            public int compare(Grade o1, Grade o2) {
                return (o1.getSt().getHoTen().compareTo(o2.getSt().getHoTen()));
            }
            
        });
    }
    public void sortByMark() {
        Collections.sort(ls, (a, b) -> (int) (a.getTBC() - b.getTBC()));
    }  
}

