package service;

public interface IBillService <E> {
    int addBills(E e);

    int fillAllById(int id);

    void updateBills(int id, E bills);

    double revenueByMonth(int month, int year);
}
