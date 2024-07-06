package VongLap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 2) {
            System.out.println("So do khong phai la so nguyen to");
        }
        int i =2 ;
        boolean isCheck = true;
        while(i < number) {
            if(number % i == 0){
                isCheck = false;
                break;
            }i++;
        }
        if(isCheck){
            System.out.println("So " + number +"la so nguyen to");
        } else {
            System.out.println("So " +number+ " khong phai la so nguyen to");
        }
    }

}
