package ProductStudent.Manager;

import java.util.ArrayList;

public interface IManager <E>{
    void add(E e);
    void edit(int id , E e);
    void remove(int id);
    int findById(int id);
    ArrayList<E> fillAll();
}
