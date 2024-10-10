package view;

import controller.albumController;

import java.util.Scanner;

public class Main {
    private albumController controller = new albumController();
    Scanner sc = new Scanner(System.in);
    int choice;
    public void renderMenu(){
        showMenu();
    }
    public void showMenu(){
        do {
            System.out.println("======MENU========");
            System.out.println("1.Quản lí Album");
            System.out.println("2.Quản lí Song");
            System.out.println("0.Thoát");

            System.out.println("Mời bạn nhập lựa chọn ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    showAllAlbum();
                    break;
                case 0:
                    System.out.println("==========THOÁT=========");
                default:
                    System.out.println("Nhập lại lựa chọn!!!");
            }
        }while (choice !=0);
    }

    private void showAllAlbum() {
        do {
            System.out.println("==========QUẢN LÍ ALBUM========");
            System.out.println("1.Thêm ablum");
            System.out.println("2.Sửa ablum");
            System.out.println("3.Xóa ablum");
            System.out.println("4.Tìm kiếm ablum");
            System.out.println("0.Thoat");

            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    showAddAlbum();
                    break;
                case 0:
                    System.out.println("=========THOÁT=======");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại lựa chọn!!");
            }
        }while (choice !=0);
    }

    private void showAddAlbum() {
//        this.controller.addAlbums(albums);
    }

}
