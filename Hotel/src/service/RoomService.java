package service;

import model.Room;
import repository.IRoomResponsitory;
import repository.RoomRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class RoomService implements IRoomService <Room>{
    private final IRoomResponsitory<Room> roomResponsitory = new RoomRepository();
    @Override
    public int addRoom(Room room) {
        return this.roomResponsitory.addRoom(room);
    }

    @Override
    public ArrayList<Room> fillAll() {
        return (ArrayList<Room>) this.roomResponsitory.fillAll();
    }

    @Override
    public int fillAllById(int id) {
        return this.roomResponsitory.fillAllById(id);
    }

    @Override
    public void update(int id ,Room room) {
        int index= fillAllById(id);
        this.roomResponsitory.update(index ,room);
    }

    @Override
    public ArrayList<Room> searchByPrice(double from,double to) {
       return this.roomResponsitory.searchByPrice(from ,to);
    }

    @Override
    public void checkRooms(String nameRoom ) {
        this.roomResponsitory.checkRooms(nameRoom);
    }
}
