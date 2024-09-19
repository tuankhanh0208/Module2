package repository;

import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IRoomResponsitory<E>{
    int addRoom(E e);

    ArrayList<Room> fillAll();

    int fillAllById(int id);

    void update(int id, Room p);

    ArrayList<E> searchByPrice(double from, double to);

    void checkRooms(String nameRoom);
}
