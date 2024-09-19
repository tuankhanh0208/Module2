package Project.View;

import Project.Model.Book;
import Project.Model.Document;
import Project.Model.Manazine;
import Project.Model.New;
import Project.manager.DocumentManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    DocumentManager documentManager = new DocumentManager();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void showMenu(){
        int choice ;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1.Thêm mới tài liệu");
            System.out.println("2.Xóa tài liệu");
            System.out.println("3.Sửa tài liệu");
            System.out.println("4.Hiển thị thông tin");
            System.out.println("5.Tìm kiếm theo loại tài lệu");
            System.out.println("6.Tìm kiếm tài liệu theo id");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuRemove();
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    showMenuDisplay();
                    break;
                case 5:
                    showSearchByType();
                    break;
                case 6:
                    showShearchByID();
                    break;
                case 0:
                    System.out.println("---------THOAT-------");
                    break;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }while (choice!=0);
    }

    private void showShearchByID() {
        System.out.println("Tìm kiếm tài liệu theo Id");
        System.out.print("Nhập mã tài liệu: ");
        int id = sc.nextInt();
        if (documentManager.findIndexId(id)==-1){
            System.out.println("Không có mã tài liệu " + id + "!");
        } else {
            System.out.println(documentManager.findDocumentById(id));
        }

    }

    private void showSearchByType() {
        int choice ;
        do {
            System.out.println("========Tìm kiếm theo loại tài liệu========");
            System.out.println("1. Tìm kiếm sách");
            System.out.println("2. Tìm kiếm tạp chí");
            System.out.println("3. Tìm kiếm báo");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    searchBook();
                    break;
                case 2:
                    searchMagazine();
                    break;
                case 3:
                    searchNews();
                    break;
                case 0:
                    System.out.println("Quay lai trang quản lý!");
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp!");
                    break;
            }
        } while (choice != 0);
    }

    private void searchNews() {
        System.out.println("=====Tìm kiếm báo=====");
        ArrayList<New> news = documentManager.getNews();
        if (news.isEmpty()) {
            System.out.println("Không tìm thấy loại tài liệu báo!");
        } else {
            for (New newspaper : news){
                System.out.println(newspaper);
            }
        }
    }

    private void searchMagazine() {
        System.out.println("=====Tìm kiếm tạp chí=====");
        ArrayList<Manazine> magazines = documentManager.getManazines();
        if (magazines.isEmpty()) {
            System.out.println("Không tìm thấy loại tài liệu tạp chí!");
        } else {
            for (Manazine magazine : magazines) {
                System.out.println(magazine);
            }
        }
    }

    private void searchBook() {
        System.out.println("=====Tìm kiếm sách=====");
        ArrayList<Book> books = documentManager.getBook();
        if (books.isEmpty()) {
            System.out.println("Không tìm thấy loại tài liệu sách!");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void showMenuDisplay() {
        int choice;
        do {
            System.out.println("========Hiển thị thông tin========");
            System.out.println("1. Hiển thị tất cả tài liệu");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Hiển thị thông tin tạp chí");
            System.out.println("4. Hiển thị thông tin báo");
            System.out.println("0. Quay lại trang quản lý");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    showAllDocuments();
                    break;
                case 2:
                    showBookDocuments();
                    break;
                case 3:
                    showManazineDocument();
                    break;
                case 4:
                    showNewsDocument();
                    break;

                case 0:
                    System.out.println("Quay lai trang quản lí");
                    break;
                default:
                    System.out.println("Nhap lai lua chon");
                    break;
            }
        }while (choice !=0);
    }



    private void showNewsDocument() {
        System.out.println("-----Thông tin tạp chí-------");
        ArrayList<Document> manazines  = documentManager.getAll();
        for (Document document : manazines ){
            if(document instanceof New){
                System.out.println(document);
            }
        }
    }

    private void showManazineDocument() {
        System.out.println("-----Thông tin tạp chí-------");
        ArrayList<Document> manazines  = documentManager.getAll();
        for (Document document : manazines ){
            if(document instanceof Manazine){
                System.out.println(document);
            }
        }
    }

    private void showBookDocuments() {
        System.out.println("-----Thông tin tạp chí-------");
        ArrayList<Document> manazines  = documentManager.getAll();
        for (Document document : manazines ){
            if(document instanceof Book){
                System.out.println(document);
            }
        }
    }

    private void showAllDocuments() {
        System.out.println("----Hiển thị tất cả thông tin sách------");
        ArrayList<Document> documents = documentManager.getAll();
        if (documents.isEmpty()){
            System.out.println("Chua co tai liey nao");
        }
        for (Document document : documents){
            System.out.println(document);
        }
    }

    private void showMenuEdit() {
        System.out.println("========Sửa thông tin tài liệu========");
        System.out.print("Nhập mã tài liệu muốn sửa: ");
        int idEdit = sc.nextInt();
        Document oldDocument = documentManager.findDocumentById(idEdit);
        if (oldDocument != null) {
            System.out.println("Tài liệu cũ: \n" + oldDocument);
            Document newDocument = null;
            if (oldDocument instanceof Book) {
                System.out.println("=====Sửa thông tin sách=====");
                System.out.print("Nhập tên sách: ");
                String name = scString.nextLine();
                System.out.print("Nhập tên nhà xuất bản: ");
                String publishName = scString.nextLine();
                System.out.print("Nhập số bản phát hành: ");
                int releaseNumber = sc.nextInt();
                System.out.print("Nhập tên tác giả: ");
                String author = scString.nextLine();
                System.out.print("Nhập số trang: ");
                int pageNumber = sc.nextInt();
                Book book = new Book(idEdit, name, publishName, releaseNumber, author, pageNumber);
                documentManager.update(book, idEdit);
                System.out.println("Sửa thông tin sách thành công!");
            } else if (oldDocument instanceof Manazine) {
                System.out.println("=====Sửa thông tin tạp chí=====");
                System.out.print("Nhập tên tạp chí: ");
                String name = scString.nextLine();
                System.out.print("Nhập tên nhà xuất bản: ");
                String publishName = scString.nextLine();
                System.out.print("Nhập số bản phát hành: ");
                int releaseNumber = sc.nextInt();
                System.out.print("Nhập số phát hành: ");
                int issueNumber = sc.nextInt();
                int releaseMonth;
                do {
                    System.out.print("Nhập tháng phát hành: ");
                    releaseMonth = sc.nextInt();
                    if (releaseMonth < 1 || releaseMonth > 12) {
                        System.out.println("Tháng không hợp lệ! Yêu cầu nhập lại.");
                    }
                } while (releaseMonth < 1 || releaseMonth > 12);
                Manazine magazine = new Manazine(idEdit, name, publishName, releaseNumber, issueNumber, releaseMonth);
                documentManager.update(magazine, idEdit);
                System.out.println("Sửa thông tin tạp chí thành công!");
            } else if (oldDocument instanceof New){
                System.out.println("=====Sửa thông tin báo=====");
                System.out.print("Nhập tên báo: ");
                String name = scString.nextLine();
                System.out.print("Nhập tên nhà xuất bản: ");
                String publishName = scString.nextLine();
                System.out.print("Nhập số bản phát hành: ");
                int releaseNumber = sc.nextInt();
                LocalDate releaseDate = null;
                while (releaseDate == null) {
                    System.out.print("Nhập ngày phát hành: ");
                    String date = scString.nextLine();
                    try {
                        releaseDate = LocalDate.parse(date, dateFormatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Ngày không hợp lệ! Yêu cầu nhập lại ngày theo định dạng dd/MM/yyyy");
                    }
                }
                New news = new New(idEdit, name, publishName, releaseNumber, releaseDate);
                documentManager.update(news, idEdit);
                System.out.println("Sửa thông tin báo thành công!");
            }
        } else {
            System.out.println("Không tìm thấy tài liệu!");
        }
    }

    private void showMenuRemove() {
        System.out.println("========Xóa tài liệu========");
        int idRemove;
        System.out.print("Nhập mã tài liệu muốn xóa: ");
        idRemove = sc.nextInt();
        if (documentManager.findIndexId(idRemove) == -1) {
            System.out.println("Không tìm thấy mã tài liệu!");
        } else {
            documentManager.remove(idRemove);
            System.out.println("Xóa tài liệu thành công!");
        }
    }

    private void showMenuAdd() {
        int choice;
        do {
            System.out.println("Thêm mới tài liệu");
            System.out.println("1.Thêm mới sách");
            System.out.println("2.Thêm mới tạp chí");
            System.out.println("3.Theem mới báo");
            System.out.println("0.Quay lại trang quản lí");
            System.out.println("Nhâp lựa chọn:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    addManazine();
                    break;
                case 3:
                    addNews();
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Nhập la lựa chọn");
                    break;
            }
        }while (choice!=0);
//
    }

    private void addNews() {
        System.out.println("-----Thêm mới báo--------");
        System.out.println("Nhập tên báo");
        String name = scString.nextLine();
        System.out.println("Nhập tên nhà xuất bản");
        String publishName = scString.nextLine();
        System.out.println("Nhập số bản phát hành");
        int releaseNumber = sc.nextInt();
        LocalDate localDate = null;
        while (localDate == null){
            System.out.println("Nhập ngày phát hành");
            String date =scString.nextLine();
            try {
                localDate = LocalDate.parse(date,dateFormatter);
            }catch (DateTimeParseException e){
                System.out.println(e.getMessage());
            }
        }
        New aNew = new New(name,publishName,releaseNumber,localDate);
        documentManager.add(aNew);
        System.out.println("Đã thêm thành công");

    }

    private void addManazine() {
        System.out.println("=====Thêm mới tạp chí=====");
        System.out.print("Nhập tên tạp chí: ");
        String name = scString.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String publishName = scString.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int releaseNumber = sc.nextInt();
        System.out.print("Nhập số phát hành: ");
        int issueNumber = sc.nextInt();
        int releaseMonth;
        do {
            System.out.print("Nhập tháng phát hành: ");
            releaseMonth = sc.nextInt();
            if (releaseMonth < 1 || releaseMonth > 12) {
                System.out.println("Tháng không hợp lệ! Yêu cầu nhập lại.");
            }
        } while (releaseMonth < 1 || releaseMonth > 12);

        Manazine magazine = new Manazine(name, publishName, releaseNumber, issueNumber, releaseMonth);
        documentManager.add(magazine);
        System.out.println("Thêm tạp chí thành công!");
    }

    private void addBook() {
        System.out.println("-----Thêm mới sách---------");
        System.out.println("Nhập tên sách:");
        String name = scString.nextLine();
        System.out.println("Nhập tên xuất bản:");
        String publishName = scString.nextLine();
        System.out.println("Nhập số bản phát hành:");
        int releaseNumber = sc.nextInt();
        System.out.println("Nhập tên tác giả:");
        String author = scString.nextLine();
        System.out.println("Nhập số trang");
        int pageNumber = sc.nextInt();
        Book book = new Book(name,publishName,releaseNumber,author,pageNumber);
        documentManager.add(book);
        System.out.println("Đã thêm thành công");
    }
}
