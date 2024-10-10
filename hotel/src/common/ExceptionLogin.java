package common;

import java.io.*;

public class ExceptionLogin {
    public static void writeToFile(String userName, String passWord , String phone ,String address , String email , String name , int age){
        try (FileWriter fw = new FileWriter("users.txt",true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(userName + "," + passWord + "," + phone + ","+address +","+email+","+name +","+age);
            bw.newLine();
            System.out.println("Đăng kí thành công!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkPassWord(String passWord){
        try {
            if (passWord.length() < 8){
                System.out.println("Mật khẩu phải trên 8 kí tự");
            } else if (!passWord.matches(".*[A-Z].*")) {
                System.out.println("Mật khẩu phải chứ kí tự viết hoa");
            }else {
                System.out.println("Mật khẩu không hợp lệ");
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }



    public static boolean readFromFile(String userName , String passWord) {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (userInfo[0].equals(userName) && userInfo[1].equals(passWord)) {
                    currentName = userInfo[5];
                    currentuserName =userInfo[0];
                    currentAge = Integer.parseInt(userInfo[6]);
                    currentPhone = userInfo[2];

                    System.out.println("Đăng nhập thành công!");
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static void showAllAccount(){
        if (currentuserName != null){
            System.out.println("=========THÔNG TIN TÀI KHOẢN===========");
            System.out.println("Họ tên của người dùng là :" + currentName);
            System.out.println("Tài khoản người dùng là :" + currentuserName);
            System.out.println("Tuổi của người dùng là :" + currentAge);
            System.out.println("Số điện thoại của người dùng là :" + currentPhone);
        }
    }
}
