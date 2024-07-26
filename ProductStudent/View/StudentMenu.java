package ProductStudent.View;

import ProductStudent.Manager.StudentManager;
import ProductStudent.Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
    StudentManager studentManager = new StudentManager();

    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);

    public void showStudents(){
        int choice ;
        do {
            System.out.println("------QUẢN LÍ STUDENTS--------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên gần đúng");
            System.out.println("5. Tìm kiếm danh sách sinh viên theo khoảng điểm ");
            System.out.println("6. Tìm kiếm danh sách sinh viên theo khoảng tuổi ");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0.Thoát");

            System.out.println("Mời bạn nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    showAddStudent();
                    break;
                case 2:
                    showEditStudent();
                    break;
                case 3:
                    showRemoveStudent();
                    break;
                case 4:
                    showFindByName();
                    break;
                case 5:
                    showFindByScore();
                    break;
                case 6:
                    showFindAge();
                    break;
                case 7:
                    showAllStudent();
                    break;
                case 0:
                    System.out.println("-------THOÁT-------");
                    break;
                default:
                    System.out.println("Moi ban nhap lai");
            }
        }while (choice!=0);
    }

    private void showAllStudent() {
        ArrayList<Student> listStudents = studentManager.fillAll();
        for (Student student : listStudents){
            System.out.println(student);
        }
    }

    private void showFindAge() {
        System.out.println("Nhap vao gia tri min");
        double from = sc.nextDouble();
        System.out.println("Nhap vao gia tri max");
        double to = sc.nextDouble();
        ArrayList<Student> list  = studentManager.findByAge(from,to);
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + " " + list.get(i));
        }
    }

    private void showFindByScore() {
        System.out.println("Nhap vao gia tri min");
        double from = sc.nextDouble();
        System.out.println("Nhap vao gia tri max");
        double to = sc.nextDouble();
        ArrayList<Student> list  = studentManager.findByScore(from,to);
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + " " + list.get(i));
        }

    }

    private void showFindByName() {
        ArrayList<Student> list  = new ArrayList<>();
        System.out.println("Nhập vào tên bạn muốn tìm kiếm");
        String name = scString.nextLine();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+ " Sinh viên tìm kiếm là : " + studentManager.findByNameContains(name) );
        }

    }

    private void showRemoveStudent() {
        System.out.println("Nhập vào id bạn muốn xóa");
        int idRemove = sc.nextInt();
        studentManager.remove(idRemove);
        System.out.println("Xóa thành công");
    }

    private void showEditStudent() {
        System.out.println("Nhập vào id sửa ");
        int id = sc.nextInt();
        System.out.println("Nhập vào tên sửa");
        String name = scString.nextLine();
        System.out.println("Nhập vào tuổi sửa");
        int age = sc.nextInt();
        System.out.println("Nhập vào điểm sửa");
        double score = sc.nextInt();
        Student student = new Student(id,name,age,score);
        studentManager.edit(id,student);
    }

    private void showAddStudent() {
        System.out.println("Nhập vào tên sinh viên");
        String name = scString.nextLine();
        System.out.println("Nhập vào tuổi của sinh viên");
        int age = sc.nextInt();
        System.out.println("Nhập vào điểm của sinh viên");
        double score = sc.nextDouble();
        Student students = new Student(name,age,score);
        studentManager.add(students);
        System.out.println("Thêm thành công");
    }
}
