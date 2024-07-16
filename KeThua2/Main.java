package KeThua2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5,"red");
        System.out.println(circle.toString());

        Cylinder cylinder =new Cylinder(300,10000,3.5,"none");
        System.out.println(cylinder.toString());
    }
}
