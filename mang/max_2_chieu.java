package mang;

import java.util.Scanner;

public class max_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong mang");
        int rows = sc.nextInt();
        System.out.println("Nhap so cot cua mang");
        int cols=sc.nextInt();
        int [] [] arr = new int[rows][cols];

        System.out.println("Nhap vao phan tu mang");
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
//                System.out.println("Phan tu " +" ");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Mang sau khi nhap la");
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
                if(arr[i][i] >max){
                    max = arr[i][i];
                }
        }
        System.out.println("Phan tu lon nhat la " + max);

        int min = arr[0][0];
        for (int i =0;i<arr.length;i++){
            if(arr[i][i] < min){
                min =arr[i][i];
            }
        }
        System.out.println("Phan tu be nhat la " + min);

    }
}
