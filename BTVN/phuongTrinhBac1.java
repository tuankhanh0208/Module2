package BTVN;

import java.util.Scanner;

public class phuongTrinhBac1{

    public static void  main (String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phương trinh bậc 1");
        System.out.println("Nhap vao so a");
        double a= sc.nextDouble();
        System.out.println("Nhap vao so b");
        double b= sc.nextDouble();
        System.out.println("Nhap vao so c");
        double c= sc.nextDouble();
        if(a != 0){
            double dental = (c-b)/a;
            System.out.println("Nghiem cua phuong trinh la " + dental);
        }else {
            if(b==c){
                System.out.println("Phương trình vô nghiệm");
            }else{
                System.out.println("Phương trình vô số nghiệm");
            }
        }
    }
}


