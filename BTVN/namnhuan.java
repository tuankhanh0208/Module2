package BTVN;

import java.util.Scanner;

public class namnhuan {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Nam nay la nam nhuan");
                } else {
                    System.out.println("Nam nay khong phai la nam nhuan");
                }
            } else {
                System.out.println("Nam nay la nam nhuan");
            }
        } else {
            System.out.println("Nam nay khong phai la nam nhuan");
        }
    }
}
