package VongLap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int choice ;

         do {
             System.out.println("Menu");
             System.out.println("1.Draw the triangle");
             System.out.println("2.Draw the square");
             System.out.println("3.Draw the rectangle");
             System.out.println("0. Exit");
             System.out.println("Enter your choice");
             choice = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.println("1.Draw the triangle");
                drawrecTangle();
                break;
            case 2 :
                System.out.println("2.Draw the square");
                squareTriangle();
                break;
            case 3:
                System.out.println("3.Draw the rectangle");
                isoscelesTriangle();
                break;
            case 0:
                System.out.println("Exit");
                break;
    }
        } while (choice != 0);
         }

    private static void drawrecTangle() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void squareTriangle (){
            for(int i=1 ;i<=5;i++){
                for (int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
         }
    public  static void  isoscelesTriangle(){
            for(int i=7;i>=1;i--){
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    }

