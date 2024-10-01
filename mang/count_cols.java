package mang;

import java.util.Scanner;

public class count_cols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so cot");
        int cols = sc.nextInt();
        System.out.println("Nhap vao so dong");
        int rows = sc.nextInt();
        int [][] arr = new int[cols][rows];

        System.out.println("Nhap vao cac phan tu");
        for (int i=0;i<cols;i++){
            for (int j=0;j<rows;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang sau khi nhap la");
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Nhap cot ban muon tinh tong");
        int n =sc.nextInt();

       if(n < 0 || n >= cols){
           System.out.println("Cot khong hop le");
       }else {
           int sum =0;
           for (int i=0;i<cols;i++){
               sum+= arr[i][n];
           }
           System.out.println(sum);
       }
    }
}
