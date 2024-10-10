package repository;

import data.DataRoom;
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
        List<Room> allRooms = DataRoom.readRoomsFromFile();
        for (Room room : allRooms) {
            if (room.getPrice() >= from && room.getPrice() <= to) {
                filteredRooms.add(room);
            }
        }
        return filteredRooms;
    }

    @Override
    public void checkRooms(String nameRoom, LocalDate startDate, LocalDate endDate) {
//        ArrayList<Room> roomArrayList = new ArrayList<>();
        List<Room> roomList1 = DataRoom.readRoomsFromFile();
        boolean isAvailable =true;
        for (Room room : roomList1){
           if (room.getNameRoom().equalsIgnoreCase(nameRoom)){
               LocalDate roomStartDate = room.getStartDate();
               LocalDate roomEndDate = room.getEndDate();

               if (!(endDate.isBefore(roomStartDate) || startDate.isAfter(roomEndDate))){
                   isAvailable=false;
                   System.out.println("Phong " + nameRoom + " da duoc dat tu " + roomStartDate + " toi ngay " +roomEndDate);
                   break;
               }
           }
        }
        if (isAvailable){
            System.out.println("Phong " + nameRoom + " trong tu  " + startDate + " toi ngay " +endDate);
        }
    }
}
