package service;

import model.Bill;
import repository.BillRepository;
import repository.IBillRepository;

public class BillService implements IBillService<Bill>{
    private final IBillRepository<Bill> billsRepository = new BillRepository();
    @Override
    public int addBills(Bill bills) {
       return this.billsRepository.addBills(bills);
    }

    @Override
    public int fillAllById(int id) {
        return this.billsRepository.fillAllById(id);
    }

    @Override
    public void updateBills(int id, Bill bills) {
        int index = fillAllById(id);
        this.billsRepository.updateBills(index,bills);
    }

    @Override
    public double revenueByMonth(int month, int year) {
        return this.billsRepository.revenueByMonth(month,year);
    }
}
