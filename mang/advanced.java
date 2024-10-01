package mang;

import java.util.ArrayList;
import java.util.Scanner;

public class advanced {

    private static ArrayList<String> studentsList = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("------MENU-------");
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.Chèn sinh viên");
            System.out.println("3.Xóa sinh viên theo ID");
            System.out.println("4.Tìm kiếm sinh viên theo ID");
            System.out.println("5.Sửa thông tinh sinh viên");
            System.out.println("0.Exit");
            System.out.println("Mời bạn nhập lựa chọn của mình");
            choice =sc.nextInt();

            switch (choice){
                case 1:
                    addStudents();
                    break;
                case 2:
                    add2Students();
                    break;
                case 3:
                    removeStudents();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    editStudents();
                    break;
                case 0:
                    System.out.println("-------EXIT------");
                    break;
            }
        }while (choice !=0);
    }

    private static void editStudents() {
       studentsList.set(0,"Khanh dep trai ");
       for (String i : studentsList){
           System.out.println(i);
       }
    }

    private static void searchStudent() {
        int index = studentsList.indexOf("Tuấn Khanh1");
        if(index != 1){
            System.out.println("Phan tu Tuấn Khanh1 được tìm thấy tại vị trí" +index);
        }else {
            System.out.println("Khon tim thay");
        }
    }

    private static void removeStudents( ) {
        studentsList.remove(1);
        System.out.println("Sinh vien da duoc xoa ");
        for (String i : studentsList){
            System.out.println(i);
        }
    }

    private static void add2Students() {
        studentsList.add(1,"Khanh qua dep trai");
        System.out.println("Chen thanh cong");
    }

    private static void addStudents() {
        studentsList.add("Tuấn Khanh1");
        studentsList.add("Tuấn Khanh2");
        studentsList.add("Tuấn Khanh3");
        studentsList.add("Tuấn Khanh4");
        studentsList.add("Tuấn Khanh5");
       for (String i : studentsList){
            System.out.println("Danh sach sinh vien la " + i);
        }
    }
}
