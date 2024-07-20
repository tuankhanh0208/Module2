package XML.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
    private int id ;
    private String name;
    private String gender;
    private double [] point;
    private static int idIncrement=1;
    public Student(){}
    public Student(String name, String gender , double [] point){
        this.id=idIncrement;
        this.name=name;
        this.gender=gender;
        this.point=point;
        idIncrement++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }
    public double averger (){
        int sum =0;
        for(int i=0;i<point.length;i++){
            sum += point[i];
        }int averger = sum/point.length;
        return averger;
    }
    @Override
    public String toString(){
        return "ID: " +getId()+" Name : " + getName() + " Gender: " + getGender() + " Point: " + Arrays.toString(point) ;
    }
}
