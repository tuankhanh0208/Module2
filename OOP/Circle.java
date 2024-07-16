package OOP;

public class Circle {
    private  double radius;
    private String color ;
    public Circle(){
        this.radius =1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius=radius;
    }
    private double getRadius() {
        return this.radius;
    }
    private double getArea(){
        return Math.PI *this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}
