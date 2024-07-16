package Accessmodifier.BaiTap;

public class Circle {
    private static final double PI =3.14;
    private static int count =0;
    private static double totalArea = 0;
    private static double maxRadius =0;
    private static Circle largestCircle=null;
    private double radius;
    private int id;
    public Circle (double radius){
        this.radius=radius;
        this.id=++count;
        totalArea += this.area();
        if (this.radius >maxRadius){
            maxRadius =this.radius;
            largestCircle=this;
        }
    }

    public double getRadius() {
        return radius;
    }
    public double area(){
        return PI*radius*radius;
    }
    public double premiter(){
        return 2*radius*PI;
    }
    public static double getTotalArea(){
        return totalArea;
    }
    public static int getCount(){
        return count;
    }
    public static Circle getLargestCircle(){
        return largestCircle;
    }
    @Override
    public String toString(){
        return "Circle{id=" + id + ", radius=" + radius + "}";
    }
}
