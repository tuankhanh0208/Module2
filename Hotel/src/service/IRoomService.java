package service;

import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface IRoomService<E> {
    int addRoom (E e);

    ArrayList<E> fillAll();

    int fillAllById(int id);

    void update(int id ,E e);

    ArrayList<E> searchByPrice(double from,double to);

    void checkRooms(String nameRoom );
}
