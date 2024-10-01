package common;

import model.Bill;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExceptionBill {
    public static void wriyetoFileBill(int id , String roomName, String tenantName, String employeeName, LocalDate startDate, LocalDate endDate , double totalPrice){
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
}
