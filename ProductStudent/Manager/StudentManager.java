package ProductStudent.Manager;

import ProductStudent.Model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    ArrayList <Student > listStudent = new ArrayList<>();

    @Override
    public void add(Student student) {
        this.listStudent.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        listStudent.set(index,student);
    }

    @Override
    public void remove(int id) {
        int index = findById(id);
        listStudent.remove(index);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getId() == id){
                return i;
            }
        }return 1 ;
    }

    public ArrayList<Student> findByNameContains (String name){
        ArrayList <Student> listSearch = new ArrayList<>();
        for (Student student : listStudent){
            if(student.getName().toUpperCase().contains(name.toUpperCase() )){
                listSearch.add(student);
            }
        } return listSearch;
    }

    public ArrayList<Student> findByScore(double from , double to){
        ArrayList <Student> listSearch = new ArrayList<>();
        for (Student student : listStudent) {
            if(student.getScore() >=from && student.getScore() <=to){
                listSearch.add(student);
            }
        }return listSearch;
    }
    public ArrayList<Student> findByAge(double from , double to){
        ArrayList <Student> listSearch = new ArrayList<>();
        for (Student student : listStudent){
            if(student.getAge() >= from && student.getAge() <= to){
                listSearch.add(student);
            }
        }return listSearch;
    }
    @Override
    public ArrayList<Student> fillAll() {
        return listStudent;
    }
}
