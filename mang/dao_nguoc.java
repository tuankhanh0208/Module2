package mang;

import java.util.Scanner;

public class dao_nguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap kich thuoc mang ");
            n =sc.nextInt();
            if(n > 20 ){
                System.out.println("Mang phai be hon 20 ");
            }
        } while (n >20);

        int [] arr = new int[n];
        System.out.println("Nhap cac phan tu mang");
        for (int i=0;i<n;i++){
            System.out.println("Phan tu thu "+ (i+1) + ":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Mang sau khi nhap la");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


       for (int i = 0 ;i <arr.length/2;i++){
           int temp = arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }
        System.out.println("Mang sau khi dao nguoc la");
       for (int i =0;i<arr.length;i++){
           System.out.print( arr[i] + " ");
       }
    }
}
