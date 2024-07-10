package Mang;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien");
        int n= sc.nextInt();
        if(n > 30){
            System.out.println("Khong duoc qua 30 sinh vien");
            return;
        }
        int [] arr = new int[n];

        System.out.println("Nhap diem cac sinh vien");
        for(int i=0;i<n;i++){
            System.out.println("Diem cua sinh vien thu " + (i+1)+ "la :");
            arr[i] =sc.nextInt();
        }

        int count =0;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            if(arr[i] >=5){
                count++;
            }
        }
        System.out.println();
        System.out.println("So luong sinh vien dat la :" + count);
    }
}
