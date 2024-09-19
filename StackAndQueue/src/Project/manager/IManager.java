package Project.manager;

import java.util.ArrayList;

public interface IManager <E>{
    void add(E e);
    void  remove(int id);
    void update(E e, int id);
    int findIndexId(int id);
    ArrayList<E> getAll();
}
