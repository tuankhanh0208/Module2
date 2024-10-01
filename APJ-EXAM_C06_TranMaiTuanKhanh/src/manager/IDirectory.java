package manager;

import model.Directory;

import java.util.List;

public interface IDirectory <E>{
    void add(E e);
    void update(String phoneNumber , E e);
    void delete(String phoneNumber);
    List<E> getAll();
    List<E> searchDirectoryByPhone(String phoneNumber);
    void saveDirectoryToFile ();
    void reloadDirectory();
    List<E> searchDirectoryByFullName(String fullName);
}
