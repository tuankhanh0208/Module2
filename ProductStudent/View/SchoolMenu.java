package ProductStudent.View;

import ProductStudent.Manager.SchoolManager;
import ProductStudent.Model.School;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMenu {
    SchoolManager schoolManager = new SchoolManager();
    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);

    public  void showMenuSchool (){
        int choice ;
        do {
            System.out.println("------Quản lí SCHOOLS-------");
            System.out.println("1.Thêm trường học");
            System.out.println("2.Xóa trường học");
            System.out.println("3.Sửa trường học");
            System.out.println("4.Tìm kiếm theo tên gần đúng");

            System.out.println("Mời bạn nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    showAddSchool();
                    break;
                case 2:
                    showRemoveSchool();
                    break;
                case 3:
                    showEditSchool();
                    break;
                case 4:
                    showFindSchool();
                    break;
                case 5:
                    showAllSchool();
                    break;
                case 0:
                    System.out.println("------Thoát------");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại lựa chọn");
            }
        }while (choice !=0);
    }

    private void showAllSchool() {
        ArrayList<School> list = schoolManager.fillAll();
        for (School school :list){
            System.out.println(school);
        }
    }

    private void showFindSchool() {
        ArrayList<School> list = new ArrayList<>();
        System.out.println("Nhập vào tên trường cần tìm kiếm");
        String nameSchool = scString.nextLine();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1 + " "  + schoolManager.findByName(nameSchool));
        }
    }

    private void showEditSchool() {
        System.out.println("Nhập vào id trường sửa");
        int id = sc.nextInt();
        System.out.println("Nhập vào tên trường sửa");
        String nameSchool = scString.nextLine();
        System.out.println("Nhập vào địa chỉ sửa");
        String addressSchool = scString.nextLine();

        School school = new School(id,nameSchool,addressSchool);
        schoolManager.edit(id,school);
    }

    private void showRemoveSchool() {
        System.out.println("Nhập vào id trường muốn xóa");
        int idRemove = sc.nextInt();
        schoolManager.remove(idRemove);
        System.out.println("-----Xóa thành công-----");
    }

    private void showAddSchool() {
        System.out.println("Nhập vào tên của trường ");
        String nameSchool = scString.nextLine();
        System.out.println("Nhập vào địa chỉ trường");
        String addressSchool = scString.nextLine();
        School school = new School(nameSchool,addressSchool);
        schoolManager.add(school);
    }
}
