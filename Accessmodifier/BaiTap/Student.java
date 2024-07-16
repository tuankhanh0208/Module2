package Accessmodifier.BaiTap;

public class Student {
    private String name = "Join";
    private String classes = "C02";
    public Student (){}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    @Override
    public String toString(){
        return " Name " + this.name + " Class " + this.classes;
    }
}
