package Accessmodifier.BaiTap;


public class Circle2 {
    private  double radius;
    private String color ;
    public Circle2(){
        this.radius =1.0;
        this.color = "red";
    }
    public Circle2(double radius){
        this.radius=radius;
    }
    private double getRadius() {
        return this.radius;
    }
    private double getArea(){
        return Math.PI *this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}
