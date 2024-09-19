package Student.view;

import Student.manager.studentManager;
import Student.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    studentManager studentManagers = new studentManager();
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
    public void showMenu(){
    int choice ;
    do {
        System.out.println("------Menu------");
        System.out.println("1.Thêm mới sinh viên");
        System.out.println("2.Xóa sinh viên");
        System.out.println("3.Sửa sinh viên");
        System.out.println("4.Tìm kiếm sinh viên");
        System.out.println("5.Danh sách sinh viên bạn cần tìm kiếm");
        System.out.println("6.Sinh viên có điểm trung bình cao nhât");
        System.out.println("7.Danh sách sinh viên");
        System.out.println("0.Thoát");
        System.out.println("Nhập vào lựa chọn của bạn");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                showAddStudent();
                break;
            case 2:
                showRemoveStudent();
                break;
            case 3:
                showEditStudent();
                break;
            case 4:
                showShearchStudent();
                break;
            case 5:
                showDisplayStudent();
                break;
            case 6 :
                showStudentAvgMax();
                break;
            case 7:
                showDisplay();
                break;
            case 0:
                System.out.println("-------THOAT-------");
                break;
            default:
            System.out.println("Vui lòng nhập lại lựa chọn");
    }
    }while (choice!=0);

}

    private void showStudentAvgMax() {
        System.out.println("-----SINH VIÊN CÓ ĐIỂM TRUNG BÌNH CAO NHẤT LÀ");
//        Map<Integer , Student> studentMap = studentManagers.getAvgMax();
        System.out.println(studentManagers.getAvgMax());
    }

    private void showDisplayStudent() {
        System.out.println("-------DANH SÁCH SINH VIÊN BẠN CẦN TÌM THEO TÊN GẦN ĐÚNG------------");
        System.out.println("Nhập tên gần đúng của sinh viên");
        String name =scString.nextLine();
        Map<Integer ,Student> studentMap = studentManagers.getSearchByName(name);
        Set<Integer> integerSet = studentMap.keySet();
        if (studentMap.isEmpty()){
            System.out.println("Không có sinh viên nào ần tìm kiếm " + name);
        }else {
            System.out.println("Danh sách sinh viên là :");
            for (Integer integer : integerSet){
                System.out.println(studentMap.get(integer));
            }
        }
    }

    private void showShearchStudent() {
        System.out.println("-------TÌM KIẾM SINH VIÊN THEO ID---------");
        System.out.println("Nhập id sinh viên :");
        int id = sc.nextInt();
        if (!studentManagers.checkID(id)){
            System.out.println("Không có sinh viên cần tìm kiếm trong danh sách" + id);
        }else {
            System.out.println("Sinh viên cần tìm kiếm là : " +studentManagers.getStudentById(id));
        }
    }

    private void showDisplay() {
        System.out.println("--------DANH SÁCH SINH VIÊN----------");
        Map<Integer,Student> studentMap = studentManagers.getStudentMap();
        Set<Integer> integerSet = studentMap.keySet();
        for (Integer integer : integerSet){
            System.out.println(studentMap.get(integer));
        }
    }

    private void showEditStudent() {
        System.out.println("---------Sửa sinh viên----------");
        System.out.println("Nhập id cần sửa:");
        int id = sc.nextInt();
        if (studentManagers.checkID(id)){
            System.out.println("Nhập tên sinh viên :");
            String name =scString.nextLine();
            System.out.println("Nhập giới tính sinh viên");
            String gender = scString.nextLine();
            double math,english,libalry;
            do {
                System.out.println("Nhập điểm toán :");
                math = sc.nextDouble();
                System.out.println("Nhập điểm anh : ");
                english = sc.nextDouble();
                System.out.println("Nhập điểm văn :");
                libalry = sc.nextDouble();
                if (!checkMark(math,english,libalry)){
                    System.out.println("Nhập lại điểm sinh viên");
                }
            }while (!checkMark(math,english,libalry));
            Student student = new Student(name,gender,math,libalry,english);
            studentManagers.add(student);
            System.out.println("Sửa sinh viên thành công");
        }
    }

    private void showRemoveStudent() {
        System.out.println("-------XOA SINH VIEN---------");
        System.out.println("Nhập id bạn cần xóa :");
        int id = sc.nextInt();
        if (studentManagers.checkID(id)){
            studentManagers.remove(id);
            System.out.println("Xóa sinh viên thành công");
        }else {
            System.out.println("Không có sinh viên này trong danh sách" + id);
        }
    }

    private void showAddStudent() {
        System.out.println("--------THEM SINH VIEN------------");
        System.out.println("Nhập tên : ");
        String name = scString.nextLine();
        System.out.println("Nhập giới tính :");
        String gender = scString.nextLine();
        double scoreMath;
        double scoreEnglish;
        double scoreLiterature;
        do {
            System.out.println("Nhập điểm toán :");
            scoreMath = sc.nextDouble();
            System.out.println("Nhập điểm anh :");
            scoreEnglish = sc.nextDouble();
            System.out.println("Nhập điểm văn :");
            scoreLiterature = sc.nextDouble();
            if (!checkMark(scoreMath, scoreEnglish, scoreLiterature)) {
                System.out.println("Nhập lại điểm sinh viên");
            }
        } while (!checkMark(scoreMath, scoreEnglish, scoreLiterature));
        Student student = new Student(name,gender,scoreMath,scoreLiterature,scoreEnglish);
        studentManagers.add(student);
        System.out.println("Thêm sinh viên thành công");
    }

    private boolean checkMark(double scoreMath, double scoreEnglish, double scoreLiterature) {
        if ( scoreMath <0 || scoreEnglish <0 || scoreLiterature < 0 || scoreMath >10 || scoreEnglish > 10 || scoreLiterature > 10){
            return false;
        }
        else {
            return true;
        }
    }
}
