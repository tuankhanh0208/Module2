package Product.VIew;

import Product.Manager.ProductManager;
import Product.Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {

        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        
        public void showMainMenu(){
            int choice ;
          do {
            System.out.println("----MENU-----");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xóa sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm");
            System.out.println("5.Hiển thị danh sách sản phảm");
              System.out.println("6.Tìm kiếm sản phẩm theo tên");
              System.out.println("7.Tìm theo teen gần đúng");
            System.out.println("0.Thoát\n");
            System.out.println("Mời bạn nhập lựa chọn");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    showAdd();
                    break;
                case 2:
                    showRemove();
                    break;
                case 3:
                    showEdit();
                    break;
                case 4:
                    showShearch();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    showShearchByName();
                    break;
                case 7:
                    showShearchNameCounts();
                    break;
                case 0:
                    System.out.println("-----THOÁT------");
                    break;

            }
        }while (choice !=0);
}

    private void showShearchNameCounts() {
        System.out.println("Nhap vao ten can tim kiem");
        String name = scString.nextLine();
        System.out.println("Ket qua tim kiem la");
        productManager.findByName(name);
    }

    private void showShearchByName() {
            ArrayList<Product> listProduct = new ArrayList<>();
        System.out.println("Nhap ten can tim kiem");
        String name = scString.nextLine();
        for (int i = 0; i <listProduct.size() ; i++) {
        System.out.println(i +1 + " " + productManager.findByName(name));
        }
    }

    private void showAll() {
            ArrayList<Product> listProduct = productManager.findAll();
        for (Product product : listProduct){
            System.out.println(product);
        }
    }

    private void showShearch() {
        System.out.println("Nhap vao id can tim kiem");
        int index =sc.nextInt();
        productManager.findIndexByID(index);

    }

    private void showEdit() {
        System.out.println("Nhập id bạn muốn sửa");
        int index =sc.nextInt();
//        System.out.println("Nhap id sản phẩm");
//        int id = sc.nextInt();
        System.out.println("Nhập tên của sản phẩm");
        String name =scString.nextLine();
        System.out.println("Nhap gia cua sản phẩm");
        double price = sc.nextDouble();
        Product product = new Product(index,name,price);
        productManager.update(index,product);
        System.out.println("Sửa thành công");
    }

    private void showRemove() {
        System.out.println("Nhập id của sản phẩm bạn muốn xóa");
        int id = sc.nextInt();
        productManager.remove(id);
        System.out.println("Xóa thành công");
    }


    public void showAdd(){
            System.out.println("Nhập id Sản phẩm");
            int id =sc.nextInt();
            System.out.println("Nhập tên sản phẩm");
            String name = scString.nextLine();
            System.out.println("Nhap gia cua san pham");
            double price =sc.nextDouble();
            Product product = new Product(id,name,price);
            productManager.add(product);
    }
    }

