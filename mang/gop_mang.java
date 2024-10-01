package mang;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Nhap kich thuoc mang 1");
        n1 =sc.nextInt();
        int [] arr1 = new int [n1];

        System.out.println("Nhap kich thuoc mang 2");
        n2 = sc.nextInt();
        int [] arr2 = new int [n2];

        System.out.println("Nhap cac phan tu mang 1");
        for(int i=0;i<n1;i++){
            System.out.println("Phan tu thu " + (i+1) + "la :");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Mang 1 sau khi nhap la");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Nhap cac phan tu mang 2");
        for (int i=0;i<n2;i++){
            System.out.println("Phan tu thu " +(i+1) + "la :");
            arr2[i]=sc.nextInt();
        }

        System.out.println("Mang 2 sau khi nhap la");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int [] arr3 =  new int [n1 + n2];

        for (int i=0 ;i<n1;i++){
            arr3[i] = arr1[i];
        }
        for (int i=0;i<n2;i++){
            arr3[n1 + i] =arr2[i];
        }
        for (int i=0;i<arr3.length;i++){
//            System.out.print("Mang 3 sau khi gop la");
            System.out.print(arr3[i] + " ");
        }
    }
}
