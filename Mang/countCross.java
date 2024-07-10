package Mang;

import java.util.Scanner;

public class countCross {
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
        int count =0;
        for (int i=0;i<cols;i++){
                count += arr[i][i];
        }
        System.out.println(count);
    }
}
