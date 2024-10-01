package mang;

import java.util.Scanner;

public class chuyen_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("Mời bạn nhập lựa chọn");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("1.Fahrenheit to Celsius");
                    System.out.println("Mời bạn nhập vào Fahrenheit");
                    double celsius = sc.nextDouble();
                    double fahrenheit =  toCelsius(celsius);
                    System.out.println("Ket qua sau chuyen doi la " + fahrenheit);

                    break;
                case 2:
                    System.out.println("2. Celsius to Fahrenheit");
                    double fahrenheitInput = sc.nextDouble();
                    double celsiusResult = toFahrenheit(fahrenheitInput);
                    System.out.println("Ket qua sau khi chuyen doi la" + celsiusResult);
                    break;
                case 0:
                    System.out.println("----Exit----");
                    break;
            }
        }while (choice !=0);
    }

    private static double toFahrenheit(double celsius) {
        return (celsius/(5.0/9))+32;
    }

    private static double toCelsius(double fahrenheit) {
        return (5.0/9)*(fahrenheit -32);
    }
}
