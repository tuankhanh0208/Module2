package repository;

import data.DataBill;
import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillRepository implements IBillRepository<Bill> {
    private List<Bill> billsList = new ArrayList<>();
    DataBill dataBill = new DataBill();

    public BillRepository() {
        this.billsList = this.dataBill.readBillsFromFile();
    }

    @Override
    public void addBills(Bill bill) {  // Changed return type to void
        this.billsList.add(bill);
        dataBill.writeToFileBill(this.billsList, true);
        System.out.println("Bill added successfully");
    }

    @Override
    public int fillAllById(int id) {
        for (int i = 0; i < billsList.size(); i++) {
            if (billsList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(int id) {
        for (int i = 0; i < billsList.size(); i++) {
            if (billsList.get(i).getId() == id) {
                billsList.remove(i);
                saveBillToFile();
                System.out.println("Bill with ID " + id + " has been deleted successfully.");
                return;
            }
        }
        System.out.println("Bill with ID " + id + " not found.");
    }


    @Override
    public void updateBills(int id, Bill bill) {
        int index = fillAllById(id);
        if (index != -1) {
            billsList.set(index, bill);
            saveBillToFile();
            System.out.println("Cập nhật bill thành công");
        } else {
            System.out.println("Không tìm thấy bill trong danh sách");
        }
    }

    public void saveBillToFile() {
        dataBill.writeToFileBill(billsList, true);
    }

    public void reloadBill() {
        this.billsList = dataBill.readBillsFromFile();
    }

    @Override
    public double revenueByMonth(int month, int year) {
        double total = 0.0;
        for (Bill bill : billsList) {  // Use billsList instead of DataBill
            if (bill.getEndDate().getMonthValue() == month && bill.getEndDate().getYear() == year) {
                total += bill.getTotalPrice();
            }
        }
        System.out.println("Total revenue for month " + month + "/" + year + ": " + total);
        return total;
    }
}
