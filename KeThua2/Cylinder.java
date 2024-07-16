package KeThua2;

public class Cylinder extends Circle{
    private double height =1.0;
    private double volume = 1.0;
    public Cylinder(){}
//    public  Cylinder (double height,double volume){
//        this.height=height;
//        this.volume=volume;
//    }
    public Cylinder(double height,double volume , double radius , String color){
        super(radius, color);
        this.volume=volume;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume *height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString (){
        return "Hinh tru co chieu cao bang " + this.height + " co the tich bang " + getVolume() + super.toString();
    }
}
