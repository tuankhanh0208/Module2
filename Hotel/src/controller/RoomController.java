package controller;

import model.Room;
import service.IRoomService;
import service.RoomService;

import java.time.LocalDate;
import java.util.ArrayList;

public class RoomController {
    private final IRoomService<Room> roomService = new RoomService();
    public int addRoom(Room room){
         return this.roomService.addRoom(room);
    }

    public ArrayList<Room> fillAll() {
        return (ArrayList<Room>) this.roomService.fillAll();
    }

    public int  fillAllById(int id) {
        return this.roomService.fillAllById(id);
    }

    public void update(int id, Room room) {
        int index = fillAllById(id);
        this.roomService.update(index,room);
    }

    public ArrayList<Room> searchByPrice(double from, double to) {
        return  this.roomService.searchByPrice(from, to);
    }

    public void checkRooms(String nameRoom) {
        this.roomService.checkRooms(nameRoom);
    }
}
