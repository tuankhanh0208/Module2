package OOP;

public class circle {
    private  double radius;
    private String color ;
    public circle(){
        this.radius =1.0;
        this.color = "red";
    }
    public circle(double radius){
        this.radius=radius;
    }
    private double getRadius() {
        return this.radius;
    }
    private double getArea(){
        return Math.PI *this.radius*this.radius;
    }

    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}
