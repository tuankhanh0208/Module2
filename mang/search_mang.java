package mang;

import java.util.Scanner;

public class search_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] students = {"Khanh","Huy","Nam","ABC"};
        System.out.println("Nhap ten ban can tim kiem");
        String nameInput = sc.nextLine();
        boolean isExist = false;
        for(int i =0;i<students.length;i++){
            if(students[i].equals(nameInput)){
                System.out.println("Sinh vien ban tim la "+ nameInput + ": " +i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Khong tim thay ten "+nameInput+ "trong danh sach");
        }
    }
}
