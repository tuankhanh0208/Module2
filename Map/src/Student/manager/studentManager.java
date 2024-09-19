package Student.manager;

import Student.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class studentManager  {
    Map<Integer,Student> studentMap = new HashMap<>();

    public void add(Student student){
        studentMap.put(student.getId(), student);
    }
    public void remove(int id){
        studentMap.remove(id);
    }
    public boolean checkID(int id){
        return studentMap.containsKey(id);
    }
    public Student getStudentById(int id){
        return studentMap.get(id);
    }
    public Map<Integer , Student> getStudentMap(){
        return studentMap;
    }
    public Student getAvgMax(){
        double maxScore = 0;
        Student topStudent = null;
        Set<Integer> integerSet = studentMap.keySet();
        for (Integer integer : integerSet){
            if (studentMap.get(integer).avgScore() > maxScore){
                maxScore = studentMap.get(integer).avgScore();
                topStudent= studentMap.get(integer);
            }
        }
        return topStudent;
    }
    public Map<Integer , Student> getSearchByName(String name){
        Map<Integer , Student> map = new HashMap<>();
        Set<Integer> integerSet = studentMap.keySet();
        for (Integer integer : integerSet){
            if (studentMap.get(integer).getName().toLowerCase().contains(name.toLowerCase())){
                map.put(integer,studentMap.get(integer));
            }
        }
        return map;
    }
}
