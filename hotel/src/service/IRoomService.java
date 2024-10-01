package service;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IRoomService<E> {

        int addRoom (E e);

        ArrayList<E> fillAll();

        int fillAllById(int id);

        void update(int id ,E e);

        ArrayList<E> searchByPrice(double from,double to);

        void checkRooms(String nameRoom, LocalDate startDate, LocalDate endDate);

//    void checkRooms(String nameRoom );
    }


