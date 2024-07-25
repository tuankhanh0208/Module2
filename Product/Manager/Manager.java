package Product.Manager;

import java.util.ArrayList;

public interface Manager<E> {
    void add(E e);
    void remove(int id);
    int  findIndexByID(int id);
    void update(int id,E e);
    void findProductByName(String name);
    ArrayList<E> findAll();

}
