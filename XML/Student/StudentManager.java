package XML.Student;

import java.util.ArrayList;

public class StudentManager {
    private Student [] listStudents;
    private int size;
    public StudentManager (){
        size=0;
        this.listStudents= new Student[100];
    }

    public void addStudents(Student student){
        this.listStudents[size] = student;
        this.size++;
    }

    public Student[] getListStudents() {
        return listStudents;
    }

    public StudentManager(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public boolean removeStudents(int id){
        int index = findById(id);
        for(int i =index;i<size;i++){
            listStudents[i] =listStudents[i+1];
        }size--;
        return false;
    }
    public Student findStudentsById(int id){
        for (Student student : this.listStudents){
            if(student.getId() == id){
                return student;
            }
        }return new Student();
    }

    public int findById(int id){
        for (int i=0;i<size;i++){
            if(id == this.listStudents[i].getId()){
                return i;
            }
        }return -1;
    }
    public void edit(int id,Student newStudents){
        int index=findById(id);
        this.listStudents[index]=newStudents;
    }
    public double getAvg(){
        double sum=0;
        for (int i = 0; i < size; i++) {
            sum+=listStudents[i].averger();
        }return sum/size;
    }
    public double getMaxAvg(){
        double max=Double.NEGATIVE_INFINITY;
        for (int i = 0; i <size ; i++) {
            if(this.listStudents[i].averger() > max) {
                max= this.listStudents[i].averger();
            }
        }return max;
    }
    public ArrayList <Student> getStudentByName(String name){
       ArrayList<Student> students  =   new ArrayList<>();

        for (int i = 0; i <size ; i++) {
            if(listStudents[i].getGender().equalsIgnoreCase(name)){
                students.add(listStudents[i]);
            }
        }return students;
    }
}