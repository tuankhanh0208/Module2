package manager;

import model.Bill;
import service.BillService;
import service.IBillService;


public class BillController  {
    private final IBillService<Bill>  billService = new BillService();

    public int addBills( Bill bills) {
        return this.billService.addBills(bills);
    }
    public int  fillAllById(int id) {
        return this.billService.fillAllById(id);
    }
    public void update(int idIndex, Bill bills) {
        int id = fillAllById(idIndex);
        this.billService.updateBills(id ,bills);
    }

    public double revenueByMonth(int month, int year) {
        return this.billService.revenueByMonth( month ,  year);
    }
}
