package mang;

import java.util.Scanner;

public class delete_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong phan tu mang");
        int N = sc.nextInt();
        int [] arr = new int[N];

        System.out.println("Nhap vao cac phan tu mang");
        for(int i=0;i<N;i++){
            System.out.println("Phan tu mang thu " + (i+1) +" la :" );
            arr[i]=sc.nextInt();
        }

        System.out.println("Mang sau khi nhap la");
        for (int i=0;i<N;i++){
            System.out.print( arr[i]+ " ");
        }
        System.out.println();

        System.out.println("Nhap vao phan tu ban muon xoa");
        int X = sc.nextInt();

        int index_del=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == X){
                index_del=i;
                break;
            }
        }

        if(index_del != -1){
            for(int i =index_del;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }N--;

            System.out.println("Mang sau khi xoa phan tu la:");
            for(int i =0;i<N;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        } else {
            System.out.println("Phan tu khong ton tai trong mang");
        }

    }
}
