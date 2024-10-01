package mang;

import java.util.Scanner;

public class max_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Nhap so phan tu mang");
            n = sc.nextInt();
            if(n > 20){
                System.out.println("Kich thuoc mang phai be hon 20");
            }
        }while (n > 20);
        int [] arr = new int[n];
        System.out.println("Nhap cac phan tu mang");
        for (int i=0;i<n;i++){
            System.out.println("Phan tu mang "+(1+i) +":" );
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang sau khi da nhap la");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max= arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] > max){
                max =arr[i];

            }
        }
        System.out.println("Phan tu lon nhat tron mang la:"+max);

        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Phan tu be nhat trong mang la :" +min);
    }
}
