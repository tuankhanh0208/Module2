package Mang;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang");
        int N = sc.nextInt();
        int [] arr = new int[N];

        System.out.println("Nhap vao cac phan tu mang");
        for(int i =0;i<N;i++){
            System.out.println("Phan tu mang thu "+(i+1) + "la :");
            arr[i] =sc.nextInt();
        }

        System.out.println("Mang sau khi nhap la");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Nhap phan tu ban muon them vao");
        int X = sc.nextInt();

        System.out.println("Nhap vao vi tri muon them");
        int index = sc.nextInt();

        if(index < -1 || index >=arr.length){
            System.out.println("Khong chen duoc phan tu vao mang");
        }else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }arr[index]=X;
            System.out.println("Mang sau khi duoc them la");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }

//
    }
}
