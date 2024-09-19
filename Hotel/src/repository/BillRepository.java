package repository;

import common.ExceptionHandler;
import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillRepository implements IBillRepository<Bill> {
    public static final ArrayList<Bill> billsList = new ArrayList<>();

    @Override
    public int addBills(Bill bills) {
        int idBills = billsList.size() + 1;
        bills.setId(idBills);
        billsList.add(bills);
        return idBills;
    }

    @Override
    public int fillAllById(int id) {
        for (int i = 0; i < billsList.size(); i++) {
            if (billsList.get(i).getId()==id){
                return i;
            }
        }return -1;
    }

    @Override
    public void updateBills(int index, Bill bills) {
        for (int i = 0; i < billsList.size(); i++) {
            if (billsList.get(i).getId() == index) {
                billsList.set(i, bills);
                break;
            }
        }
    }

    @Override
    public double revenueByMonth(int month, int year) {
        List<Bill> billsList = ExceptionHandler.readBillsFromFile();
        double total =0.0;
        for (Bill bill : billsList){
            if (bill.getEndDate().getMonthValue() == month && bill.getEndDate().getYear() == year){
                total +=bill.getTotalPrice();
            }
        }
        System.out.println(total);
        return total;
    }

}
