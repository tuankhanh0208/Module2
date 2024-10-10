package data;

import model.Room;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataRoom {
    public static void writetoFileRoom(int idRoom , String nameRoom, int numberToilet, int numberBedRoom, double price , String status, LocalDate startDate, LocalDate endDate){
        try (FileWriter fw = new FileWriter("rooms.csv",true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(idRoom + "," + nameRoom + "," + numberToilet + ","+numberBedRoom +","+price+","+status + "," + startDate + "," + endDate);
            bw.newLine();
            System.out.println("Thêm phòng mới thành công");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void editRoomInFile(int idRoom, Room updatedRoom) {
        List<Room> roomList = new ArrayList<>();
        try (FileReader fr = new FileReader("rooms.csv");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] roomDetails = line.split(",");
                int id = Integer.parseInt(roomDetails[0]);
                String name = roomDetails[1];
                int toilets = Integer.parseInt(roomDetails[2]);
                int bedrooms = Integer.parseInt(roomDetails[3]);
                double price = Double.parseDouble(roomDetails[4]);
                String status = roomDetails[5];
                LocalDate startDate = LocalDate.parse(roomDetails[6]);
                LocalDate endDate = LocalDate.parse(roomDetails[7]);

                Room room = new Room(id, name, toilets, bedrooms, price, status,startDate,endDate);
                roomList.add(room);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        for (Room room : roomList) {
            if (room.getIdRoom() == idRoom) {
                room.setNameRoom(updatedRoom.getNameRoom());
                room.setNumberToilet(updatedRoom.getNumberToilet());
                room.setNumberBedRoom(updatedRoom.getNumberBedRoom());
                room.setPrice(updatedRoom.getPrice());
                room.setStatus(updatedRoom.getStatus());
                room.setStartDate(updatedRoom.getStartDate());
                room.setStartDate(updatedRoom.getEndDate());
                break;
            }
        }
        try (FileWriter fw = new FileWriter("rooms.csv");
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (Room room : roomList) {
                bw.write(room.getIdRoom() + "," + room.getNameRoom() + "," + room.getNumberToilet() + ","
                        + room.getNumberBedRoom() + "," + room.getPrice() + "," + room.getStatus() + "," + room.getStartDate() + "," +room.getEndDate());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public  static  List<Room> readRoomsFromFile() {
        List<Room> roomList = new ArrayList<>();

        try (FileReader fr = new FileReader("rooms.csv");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] roomDetails = line.split(",");
                int idRoom = Integer.parseInt(roomDetails[0]);
                String nameRoom = roomDetails[1];
                int numberToilet = Integer.parseInt(roomDetails[2]);
                int numberBedRoom = Integer.parseInt(roomDetails[3]);
                double price = Double.parseDouble(roomDetails[4]);
                String status = roomDetails[5];
                LocalDate startDate = LocalDate.parse(roomDetails[6]);
                LocalDate endDate = LocalDate.parse(roomDetails[7]);
                Room room = new Room(idRoom, nameRoom, numberToilet, numberBedRoom, price, status,startDate,endDate);
                roomList.add(room);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        return roomList;
    }
}
