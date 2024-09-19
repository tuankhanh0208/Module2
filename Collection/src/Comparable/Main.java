package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Khanh" ,20,"DN");
        Student student1 = new Student("Khanh1" ,10,"DN");
        Student student2 = new Student("Khanh2" ,25,"DN");
        Student student3 = new Student("Khanh3" ,15,"DN");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}
