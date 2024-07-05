package BTVN;

import java.util.Scanner;

public class phuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2 /n");

        System.out.println("Nhap he so a");
        double a = sc.nextDouble();

        System.out.println("Nhap he so b");
        double b = sc.nextDouble();

        System.out.println("Nhap he so c");
        double c = sc.nextDouble();

        if(a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo nghiem");
            }else {

                System.out.println("Nghiem cua phuong trinh la " + (-b/c));
            }
            return;
        }
        double dental =  b*b - 4*a*c;
        double x1;
        double x2;
        if (dental > 0) {
            x1 = (float) ((-b + Math.sqrt(dental)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(dental)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (dental == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else  {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
