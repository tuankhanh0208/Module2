package view;

import common.ExceptionBill;
import common.ExceptionHandler;
import common.ExceptionLogin;
import common.ExceptionRoom;
import manager.BillController;
import manager.RoomController;
import model.Bill;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    private static Scanner  sc = new Scanner(System.in);
    private static Scanner  scString = new Scanner(System.in);
    private RoomController roomController = new RoomController();
    private BillController billController = new BillController();
        int choice;
    public void renderView(){
        mainMenu();
    }
    private void mainMenu() {
        do {
            System.out.println("======SHOW HOTEL======");
            System.out.println("1.Quản lí phòng khách sạn");
            System.out.println("2.Quản lí hóa đơn");
            System.out.println("3.Xem thông tin tài khoản");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chọn của bạn:");
            choice = ExceptionHandler.checkParseInt();
            switch (choice) {
                case 1:
                    showAllRoom();
                    break;
                case 2:
                    showAllBill();
                    break;
                case 3:
                    showAllCurrent();
                    break;
                case 0:
                    System.out.println("=======THOAT========");
                    break;
                default:
                    System.out.println("Vui long nhap lai");
            }
        } while (choice !=0);
    }

    private void showAllCurrent() {
        ExceptionLogin.showAllAccount();
    }

    private void showAllBill() {
        do {
        System.out.println("======QUẢN LÍ HÓA ĐƠN KHÁCH SẠN=========");
        System.out.println("1.Tạo hóa đơn mới");
        System.out.println("2.Sửa hóa đơn ");
        System.out.println("3.Xem danh sách hóa đơn");
        System.out.println("4.Xem tổng thu nhập của tháng ");
        System.out.println("0.Quay lại menu chính");
        System.out.print("Nhập lựa chọn của bạn : ");
        choice =ExceptionHandler.checkParseInt();
        switch (choice){
            case 1:
                showAddBills();
                break;
            case 2:
                showEditBills();
                break;
            case 3:
                showAllBills();
                break;
            case 4:
                showAllRevenueByMonth();
                break;
            case 0:
                System.out.println("Quay lại trang chủ");
                break;
            default:
                System.out.println("Nhập lại :");
        }
        }while (choice!=0);

    }

    private void showAllRevenueByMonth() {
        System.out.println("Nhập tháng :");
        int month = ExceptionHandler.checkParseInt();
        System.out.println("Nhập năm :");
        int year = ExceptionHandler.checkParseInt();
//        this.billController.revenueByMonth(month,year);
        double totalRevenue= this.billController.revenueByMonth(month, year);
        System.out.println("Tổng doanh thu cho tháng " + month + "/" + year + " là: " + totalRevenue);
    }
    private void showAllBills() {
        List<Bill> billsList = ExceptionBill.readBillsFromFile();
        if (billsList.isEmpty()) {
            System.out.println("Không có hóa đơn nào trong hệ thống.");
        } else {
            for (Bill bill : billsList) {
                System.out.println(bill);
            }
        }
    }

    private void showEditBills() {
        System.out.println("Nhập id bạn cần sửa thông tin bill");
        int idIndex = ExceptionHandler.checkParseInt();
        System.out.println("Nhập tên phòng :");
        String nameRoom = scString.nextLine();
        System.out.println("Nhập người thuê");
        String tenantName = scString.nextLine();
        System.out.println("Nhập tên nhân viên :");
        String employeeName = scString.nextLine();
        System.out.println("Nhập ngày bắt đầu thuê :");
        LocalDate startDate = ExceptionHandler.checkParseLocaDate();
        System.out.println("Nhập ngày kết thúc thuê :");
        LocalDate endDate = ExceptionHandler.checkParseLocaDate();
        System.out.println("Tổng tiền thuê là :");
        double totalPrice = ExceptionHandler.checkParseDouble();
        Bill bills = new Bill(idIndex,nameRoom,tenantName,employeeName,startDate,endDate,totalPrice);
        this.billController.update(idIndex, bills);
        ExceptionBill.editBillInFile(idIndex,bills);
        System.out.println("ĐÃ SỬA THÀNH CÔNG");
    }

    private void showAddBills() {
        System.out.println("======THÊM MỚI BILLS========");
        System.out.println("Nhập id bill");
        int id = ExceptionHandler.checkParseInt();
        System.out.println("Nhập tên phòng :");
        String nameRoom = scString.nextLine();
        System.out.println("Nhập người thuê");
        String tenantName = scString.nextLine();
        System.out.println("Nhập tên nhân viên :");
        String employeeName = scString.nextLine();
        System.out.println("Nhập ngày bắt đầu thuê :");
        LocalDate startDate = ExceptionHandler.checkParseLocaDate();
        System.out.println("Nhập ngày kết thúc thuê :");
        LocalDate endDate = ExceptionHandler.checkParseLocaDate();
        System.out.println("Tổng tiền thuê là :");
        double totalPrice = ExceptionHandler.checkParseDouble();
        Bill bills = new Bill(id,nameRoom,tenantName,employeeName,startDate,endDate,totalPrice);
        this.billController.addBills(bills);
        ExceptionBill.wriyetoFileBill(id,nameRoom,tenantName,employeeName,startDate,endDate,totalPrice);
    }

    private void showAllRoom() {
        do {
        System.out.println("=====QUẢN LÍ PHÒNG KHÁCH SẠN=====");
        System.out.println("1.Danh sách phòng");
        System.out.println("2.Tìm kiếm phòng theo giá");
        System.out.println("3.Kiểm tra phòng");
        System.out.println("4.Thêm mới phòng");
        System.out.println("5.Sửa phòng");
        System.out.println("0.Quay lại menu chính");
        System.out.print("Nhập lựa chọn của bạn");
        choice = ExceptionHandler.checkParseInt();
        switch (choice){
            case 1:
                showAllRooms();
                break;
            case 2:
                showSearchByPrice();
                break;
            case 3:
                showCheckRoom();
                break;
            case 4:
                showAddRoom();
                break;
            case 5:
                showEditRoom();
                break;
        }
        }while (choice!=0);
    }

    private void showCheckRoom() {
        System.out.println("Nhập tên phòng:");
        String nameRoom = scString.nextLine();

        System.out.println("Nhập ngày bắt đầu:");
        LocalDate startDate = ExceptionHandler.checkParseLocaDate();

        System.out.println("Nhập ngày kết thúc:");
        LocalDate endDate = ExceptionHandler.checkParseLocaDate();
        this.roomController.checkRooms(nameRoom,startDate,endDate);
    }

    private void showSearchByPrice() {
        System.out.println("Nhập vào giá trị min:");
        double from = ExceptionHandler.checkParseDouble();
        System.out.println("Nhập vào giá trị max:");
        double to =ExceptionHandler.checkParseDouble();
        ArrayList<Room> roomArrayList = roomController.searchByPrice(from, to);
        if (roomArrayList.isEmpty()) {
            System.out.println("Không có phòng nào trong khoảng giá này.");
        } else {
            for (int i = 0; i < roomArrayList.size(); i++) {
                System.out.println((i + 1) + ". " + roomArrayList.get(i));
            }
        }
    }


    private void showEditRoom() {
        System.out.println("Nhập id phòng bạn muốn cập nhật:");
        int idIndex = ExceptionHandler.checkParseInt();
        System.out.println("Nhập tên phòng:");
        String nameRoom = scString.nextLine();
        System.out.println("Nhập số nhà vệ sinh:");
        int numberToilet = ExceptionHandler.checkParseInt();
        System.out.println("Nhập số phòng ngủ:");
        int numberBedRoom = ExceptionHandler.checkParseInt();
        System.out.println("Nhập giá phòng:");
        double price =ExceptionHandler.checkParseDouble();
        System.out.println("Nhập trạng thái phòng:");
        String status = scString.nextLine();
        System.out.println("Nhập ngày bắt đầu :");
        LocalDate startDate = ExceptionHandler.checkParseLocaDate();
        System.out.println("Nhập ngày kết thúc :");
        LocalDate endDate = ExceptionHandler.checkParseLocaDate();
        Room room = new Room(idIndex, nameRoom, numberToilet, numberBedRoom, price, status,startDate,endDate);
        this.roomController.update(idIndex, room);
        ExceptionRoom.editRoomInFile(idIndex,room);
        System.out.println("ĐÃ SỬA THÀNH CÔNG");
    }

    private void showAllRooms() {
        List<Room> roomList = ExceptionRoom.readRoomsFromFile();
        if (roomList.isEmpty()) {
            System.out.println("Không có phòng nào trong hệ thống.");
        } else {
            for (Room room : roomList) {
                System.out.println(room);
            }
        }
    }
    private void showAddRoom() {
        System.out.println("=======THÊM PHÒNG MỚI==========");
        System.out.println("Nhập id phòng");
        int idRoom = ExceptionHandler.checkParseInt();
        System.out.println("Nhập tên phòng :");
        String nameRoom = scString.nextLine();
        System.out.println("Nhập số nhà vệ sinh :");
        int numberToilet = ExceptionHandler.checkParseInt();
        System.out.println("Nhập số phòng ngủ :");
        int numberBedRoom = ExceptionHandler.checkParseInt();
        System.out.println("Nhập giá phòng");
        double price = ExceptionHandler.checkParseDouble();
        System.out.println("Nhập trạng thái phòng");
        String status = scString.nextLine();
        System.out.println("Nhập ngày bắt đầu :");
        LocalDate startDate =ExceptionHandler.checkParseLocaDate();
        System.out.println("Nhập ngày kết thúc :");
        LocalDate endDate = ExceptionHandler.checkParseLocaDate();
        Room room = new Room(idRoom,nameRoom,numberToilet,numberBedRoom,price,status,startDate,endDate);
         this.roomController.addRoom(room);
        ExceptionRoom.writetoFileRoom(idRoom,nameRoom, numberToilet, numberBedRoom, price, status,startDate,endDate);
        System.out.println("Phòng đã được thêm thành công!");
    }
}
