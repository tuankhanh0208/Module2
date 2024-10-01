package mang;

import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String stringChuoi = sc.nextLine();
        System.out.println("Nhap ki tu can dem");
        char stringCount = sc.nextLine().charAt(0);
        int count =0;
        for (int i=0;i<stringChuoi.length();i++){
            if(stringCount == stringChuoi.charAt(i)){
                count++;
            }
        }
        System.out.println("Tong ki tu xuat hien la" + count);
    }
}
