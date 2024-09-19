package common;

import model.Bill;
import model.Room;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionHandler {
    private final static Scanner sc = new Scanner(System.in);
    private static String currentuserName;
    private static String currentName;
    private static int currentAge;
    private static String  currentPhone;
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
    public static int checkParseInt(){
    int value;
    while (true){
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        }catch (NumberFormatException e){
            System.out.println("Nhap lai");
        }
    }
    }
    public static int checkParseDouble(){
        int value;
        while (true){
            try {
            value = (int) Double.parseDouble(sc.nextLine());
            return value;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static LocalDate checkParseLocaDate(){
        LocalDate date = null;
        while (date == null) {
//            System.out.println("Nhập ngày (yyyy-MM-dd):");
            String input = sc.nextLine();
            try {
                date = LocalDate.parse(input);
            } catch (DateTimeParseException e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng yyyy-MM-dd.");
            }
        }
        return date;
    }
    public static void checkEmail(String email){
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        while (true) {
            try {
                if (matcher.matches()) {
                    System.out.println("Email hợp lệ : " + email);
                } else {
                    throw new IllegalArgumentException("Email không đúng định dạng");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi " + e.getMessage());
            }
        }
    }
    public static int CheckAge(){
        int value ;
        while (true){
            try {
                value= sc.nextInt();
                if (value > 18 ){
                    return value;
                }else {
                    System.out.println("Phải lớn hơn 18 tuổi " );
                }
            }catch (InputMismatchException e){
                System.out.println("Nhập lại ");
            }
        }
    }
    public static void writetoFileRoom(int idRoom , String nameRoom, int numberToilet, int numberBedRoom, double price , String status, LocalDate startDate,LocalDate endDate){
        try (FileWriter fw = new FileWriter("rooms.txt",true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(idRoom + "," + nameRoom + "," + numberToilet + ","+numberBedRoom +","+price+","+status + "," + startDate + "," + endDate);
            bw.newLine();
            System.out.println("Thêm phòng mới thành công");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void wriyetoFileBill(int id ,String roomName,String tenantName,String employeeName,LocalDate startDate,LocalDate endDate ,double totalPrice){
        try (FileWriter fw = new FileWriter("bills.txt" ,true);
        BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(id + "," +roomName + "," + tenantName + "," + employeeName + "," + startDate + "," + endDate + "," + totalPrice);
            bw.newLine();
            System.out.println("Thêm bill mới thành công");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void editBillInFile(int idBill, Bill updatedBill) {
        List<Bill> billList = new ArrayList<>();
        try (FileReader fr = new FileReader("bills.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] billDetails = line.split(",");
                int id = Integer.parseInt(billDetails[0]);
                String roomName = billDetails[1];
                String tenantName = billDetails[2];
                String employeeName = billDetails[3];
                LocalDate startDate = LocalDate.parse(billDetails[4]);
                LocalDate endDate = LocalDate.parse(billDetails[5]);
                double totalPrice = Double.parseDouble(billDetails[6]);
                Bill bill = new Bill(id, roomName, tenantName, employeeName, startDate, endDate, totalPrice);
                billList.add(bill);
            }
        } catch (IOException e) {
            System.out.println("Error reading bills from file: " + e.getMessage());
        }
        for (Bill bill : billList) {
            if (bill.getId() == idBill) {
                bill.setRoomName(updatedBill.getRoomName());
                bill.setTenantName(updatedBill.getTenantName());
                bill.setEmployeeName(updatedBill.getEmployeeName());
                bill.setStartDate(updatedBill.getStartDate());
                bill.setEndDate(updatedBill.getEndDate());
                bill.setTotalPrice(updatedBill.getTotalPrice());
                break;
            }
        }
        try (FileWriter fw = new FileWriter("bills.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (Bill bill : billList) {
                bw.write(bill.getId() + "," + bill.getRoomName() + "," + bill.getTenantName() + ","
                        + bill.getEmployeeName() + "," + bill.getStartDate() + "," + bill.getEndDate() + ","
                        + bill.getTotalPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
    public  static  List<Bill> readBillsFromFile() {
        List<Bill> billList = new ArrayList<>();

        try (FileReader fr = new FileReader("bills.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] billDetails = line.split(",");
                int id = Integer.parseInt(billDetails[0]);
                String roomName = billDetails[1];
                String tenantName = billDetails[2];
                String employeeName = billDetails[3];
                LocalDate startDate = LocalDate.parse(billDetails[4]);
                LocalDate endDate = LocalDate.parse(billDetails[5]);
                double totalPrice = Double.parseDouble(billDetails[6]);
                Bill bill = new Bill(id, roomName, tenantName, employeeName, startDate, endDate, totalPrice);
                billList.add(bill);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        return billList;
    }

    public static void editRoomInFile(int idRoom, Room updatedRoom) {
        List<Room> roomList = new ArrayList<>();
        try (FileReader fr = new FileReader("rooms.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] roomDetails = line.split(",");
                int id = Integer.parseInt(roomDetails[0]);
                String name = roomDetails[1];
                int toilets = Integer.parseInt(roomDetails[2]);
                int bedrooms = Integer.parseInt(roomDetails[3]);
                double price = Double.parseDouble(roomDetails[4]);
                String status = roomDetails[5];
                LocalDate startDate = LocalDate.parse(roomDetails[6]);
                LocalDate endDate = LocalDate.parse(roomDetails[7]);

                Room room = new Room(id, name, toilets, bedrooms, price, status,startDate,endDate);
                roomList.add(room);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        for (Room room : roomList) {
            if (room.getIdRoom() == idRoom) {
                room.setNameRoom(updatedRoom.getNameRoom());
                room.setNumberToilet(updatedRoom.getNumberToilet());
                room.setNumberBedRoom(updatedRoom.getNumberBedRoom());
                room.setPrice(updatedRoom.getPrice());
                room.setStatus(updatedRoom.getStatus());
                room.setStartDate(updatedRoom.getStartDate());
                room.setStartDate(updatedRoom.getEndDate());
                break;
            }
        }
        try (FileWriter fw = new FileWriter("rooms.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (Room room : roomList) {
                bw.write(room.getIdRoom() + "," + room.getNameRoom() + "," + room.getNumberToilet() + ","
                        + room.getNumberBedRoom() + "," + room.getPrice() + "," + room.getStatus() + "," + room.getStartDate() + "," +room.getEndDate());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public  static  List<Room> readRoomsFromFile() {
        List<Room> roomList = new ArrayList<>();

        try (FileReader fr = new FileReader("rooms.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] roomDetails = line.split(",");
                int idRoom = Integer.parseInt(roomDetails[0]);
                String nameRoom = roomDetails[1];
                int numberToilet = Integer.parseInt(roomDetails[2]);
                int numberBedRoom = Integer.parseInt(roomDetails[3]);
                double price = Double.parseDouble(roomDetails[4]);
                String status = roomDetails[5];
                LocalDate startDate = LocalDate.parse(roomDetails[6]);
                LocalDate endDate = LocalDate.parse(roomDetails[7]);
                Room room = new Room(idRoom, nameRoom, numberToilet, numberBedRoom, price, status,startDate,endDate);
                roomList.add(room);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        return roomList;
    }
}
