package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private   double a ;
    private   double b ;
    private   double c ;

    public QuadraticEquation (){
    }
    public QuadraticEquation(double a,double b , double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA (){
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public  double getB (){
        return  b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public  double getDiscriminant() {
        return  b*b-4*a*c;
    }
    public double getRoot1 (){
        double delta = getDiscriminant();
        if(delta < 0){
            return 0;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);

    }
    public double getRoot2(){
        double delta =getDiscriminant();
        if(delta <0){
            return 0 ;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public void display (){

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

    }
}
