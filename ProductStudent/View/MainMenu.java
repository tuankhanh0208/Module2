package ProductStudent.View;

import java.util.Scanner;

public class MainMenu {
    SchoolMenu schoolMenu = new SchoolMenu();
    StudentMenu studentMenu = new StudentMenu();
    Scanner sc = new Scanner(System.in);

    public void show(){
    int choice ;
     do{
         System.out.println("-----MENU------");
         System.out.println("1.Quản lí sinh viên");
         System.out.println("2.Quản lí trường học");
         System.out.println("0.Thoát");

         System.out.println("Mời bạn nhập lựa chọn");
         choice = sc.nextInt();

         switch (choice){
             case 1:
                 studentMenu.showStudents();
                 break;
             case 2:
                 schoolMenu.showMenuSchool();;
                 break;
             case 0:
                 System.out.println("------THOÁT------");
                 break;
             default:
                 System.out.println("Mời bạn nhập lại lựa chọn");

         }

    }while (choice!=0);

    }
}
