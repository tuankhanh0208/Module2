package Compare;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      Student student1 = new Student("Khanh " ,20,"ĐN");
      Student student2 = new Student("Khanh1 " ,200,"ĐN");
      Student student3 = new Student("Khanh2 " ,2000,"ĐN");
        Map<Integer , Student> map = new HashMap<Integer,Student>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        map.put(4,student1);
        for (Map.Entry<Integer,Student> entry : map.entrySet()){
            System.out.println(entry.toString());

        }
            Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
