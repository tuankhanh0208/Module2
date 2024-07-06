package VongLap;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double money = 1.0;
         int month = 1;
         double interestRate =1.0;
         money = sc.nextDouble();
         month = sc.nextInt();
         interestRate = sc.nextDouble();
         double totalInterRate = 0;
         for(int i=0;i< month ;i++){
             totalInterRate += money *(interestRate/100)/12*month;
         }
        System.out.println(totalInterRate);


    }
}
