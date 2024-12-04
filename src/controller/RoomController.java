package controller;

import model.Patient;
import model.Room;

public class RoomController{
    public static String setForPatient(Room room, Patient patient) {
        if (room.getAvailability()) {
            room.setAvailability(false);
            room.setPatient(patient);
            return "Ruangan nomor " + room.getRoomNumber() + " telah ditetapkan untuk patient " + patient.getName();

        } else {
            return "Ruangan nomor " + room.getRoomNumber() + " tidak tersedia";
        }
    }


    public static void emptyUpRoom(Room room) {
        room.setAvailability(true);
        System.out.println("Ruangan nomor " + room.getRoomNumber() + " sekarang kosong");
        room.setPatient(null);
    }

    
}