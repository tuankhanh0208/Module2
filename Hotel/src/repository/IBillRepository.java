package repository;

public interface IBillRepository <E> {
    int addBills(E bills);

    int fillAllById(int id);

    void updateBills(int index, E bills);

    double revenueByMonth(int month, int year);
}
