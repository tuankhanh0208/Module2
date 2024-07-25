package ProductStudent.Login;

import ProductStudent.ShowMenu;
import ProductStudent.View.MainMenu;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);

    public void login(){
        int choice ;
        do {
            System.out.println("------LOGIN-----");
            System.out.println("1.Đăng kí");
            System.out.println("2.Đăng nhập");
            System.out.println("0.Thoát");

            System.out.println("Mời bạn nhập lựa chọn");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    showSignUp();
                    break;
                case 2:
                    if(showLogin() ){
                        showMenuOptions();
                    }
                    break;
                case 0:
                    System.out.println("-------THOÁT-----");
                    break;
                default:
                    System.out.println("Mời nhập lại lựa chọn");
            }
        }while (choice!=0);
    }

    private void showMenuOptions() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
    }

    private boolean showLogin() {
        System.out.println("Nhập tên đăng nhập");
        String userName = scString.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = scString.nextLine();
        if (!userName.isEmpty() && !password.isEmpty()) {

            System.out.println("Đăng nhập thành công!");
            return true;
        } else {
            System.out.println("Tài khoản và mật khẩu không được bỏ trống.");
            return false;
        }

    }

    private void showSignUp() {
        System.out.println("Nhập tên đăng nhập");
        String userName = scString.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = scString.nextLine();
        System.out.println("Nhập lại mật khẩu");
        String againPassWord = scString.nextLine();
        if(password.equals(againPassWord) ){
            if(!userName.isEmpty() && !password.isEmpty()){
                System.out.println("Đăng kí thành công");
            }
            else {
                System.out.println("tài khoản và mật khẩu không đc bỏ trống");
        }
            }else {
                System.out.println("Vui lòng nhập mật khẩu");
            }
    }
}
