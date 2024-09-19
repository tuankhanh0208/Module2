package view;

import common.ExceptionHandler;

import java.io.*;
import java.util.Scanner;

public class LoginView {
    private static Scanner sc = new Scanner(System.in);
    private PersonView personView = new PersonView();
    int choice;
    public void showLogin(){

        do {
        System.out.println("======ĐĂNG KÍ HOẶC ĐĂNG NHẬP======");
        System.out.println("1.Đăng nhập");
        System.out.println("2.Đăng kí");
        System.out.println("0.Thoát");
        System.out.printf("Nhập lựa chọn của bạn");
         choice = ExceptionHandler.checkParseInt();
        switch (choice){
            case 1:
                showAllLogin();
                break;
            case 2:
                showAllSignUp();
                break;
            case 0:
                System.out.println("=========THOÁT=========");
                break;
            default:
                System.out.println("Vui lòng nhập lại");
                break;
        }
        }while (choice!=0);
    }

    private void showAllLogin() {
        System.out.println("==========ĐĂNG NHẬP===========");
        System.out.println("Nhập tài khoản");
        String userName = sc.nextLine().toLowerCase();
        System.out.println("Nhập mật khẩu");
        String passWord = sc.nextLine();
//        ExceptionHandler.checkPassWord(passWord);
        if (!ExceptionHandler.readFromFile(userName , passWord)){
            System.out.println("Sai tài khoản hoặc mật khẩu");
        }
        else {
            personView.renderView();
        }
    }

    private void showAllSignUp() {
        System.out.println("=========ĐĂNG KÍ===========");
        System.out.println("Nhập tài khoản :");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu :");
        String passWord = sc.nextLine();
        ExceptionHandler.checkPassWord(passWord);

        System.out.printf("Nhập số điện thoại :");
        String phone = sc.nextLine();
        System.out.println("Nhập nơi ở :");
        String address = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        ExceptionHandler.checkEmail(email);
        System.out.println("Nhập tên :");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = ExceptionHandler.CheckAge();
        ExceptionHandler.writeToFile(userName,passWord,phone,address,email,name,age);
    }

}
