package Product.VIew;

import java.util.Scanner;

public class MainMenu {
    private CustomerMenu customerMenu = new CustomerMenu();
    private ProductMenu productMenu = new ProductMenu();
    Scanner sc = new Scanner(System.in);
    public void selectMenu(){
        int choice;
        do {
            System.out.println("------MENU-------");
            System.out.println("1.Quản lí khách hàng");
            System.out.println("2,Quản lí sản phẩm");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    customerMenu.showMain();
                    break;
                case 2:
                    productMenu.showMainMenu();
            }
        }while (choice!=0);
    }
}
