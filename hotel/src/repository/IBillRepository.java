package repository;

public interface IBillRepository <E> {
    void addBills(E bills);

    int fillAllById(int id);
    void delete(int id);
    void updateBills(int index, E bills);

    double revenueByMonth(int month, int year);
}
