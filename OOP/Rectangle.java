package OOP;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public  Rectangle (){

    }
    public  Rectangle (double width,double height) {
        this.width=width;
        this.height=height;
    }
    public double  getArea (){
        return this.width*this.width;
    }
    public  double getPerimeter (){
        return this.width*this.height;
    }
    public  void display (){
        System.out.println("Chu vi hinh chu nhat la" + getArea());
        System.out.println("Dien tich hinh chu nhat la" + getPerimeter());
        System.out.println("Helllo");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
         Rectangle hcn = new Rectangle(width,height);
         hcn.display();
         hcn.getArea();
         hcn.getPerimeter();
    }
}
