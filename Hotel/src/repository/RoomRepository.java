package repository;

import common.ExceptionHandler;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomResponsitory<Room> {
    public static final ArrayList<Room> roomList = new ArrayList<>();
    @Override
    public int addRoom(Room room) {
        int idRoom = roomList.size() + 1;
        room.setIdRoom(idRoom);
        roomList.add(room);
        return idRoom;
    }

    @Override
    public ArrayList<Room> fillAll() {
        return roomList;
    }

    @Override
    public int fillAllById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getIdRoom()==id){
                return i;
            }
        }return -1;
    }

    @Override
    public void update(int id, Room room) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getIdRoom() == id) {
                roomList.set(i, room);
                break;
            }
        }
    }


    @Override
    public ArrayList<Room> searchByPrice(double from , double to) {
        ArrayList<Room> filteredRooms = new ArrayList<>();
        List<Room> allRooms = ExceptionHandler.readRoomsFromFile();
        for (Room room : allRooms) {
            if (room.getPrice() >= from && room.getPrice() <= to) {
                filteredRooms.add(room);
            }
        }
        return filteredRooms;
    }

    @Override
    public void checkRooms(String nameRoom ) {
        ArrayList<Room> roomArrayList = new ArrayList<>();
        List<Room> roomList1 = ExceptionHandler.readRoomsFromFile();
        for (Room room : roomList1){
//            if (room.getStartDate() )
        }
    }
}
