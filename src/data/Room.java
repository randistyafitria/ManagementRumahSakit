package data;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private Patient patient;

    public Room(int roomNumber, String roomType, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public Boolean getAvailability(){
        return isAvailable;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    
    public void setForPatient(Patient patient) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Ruangan nomor " + roomNumber + " telah ditetapkan untuk patient " + patient.getName());
            this.patient = patient;
        } else {
            System.out.println("Ruangan nomor " + roomNumber + " tidak tersedia");
        }
    }
    
    public void emptyRoom() {
        isAvailable = true;
        System.out.println("Ruangan nomor " + roomNumber + " sekarang kosong");
        this.patient = null;
    }

    public void getDetail() {

        System.out.println("Nomor Ruangan: " + roomNumber);
        System.out.println("Tipe Ruangan: " + roomType);
        System.out.println("Status Ruangan: " + (isAvailable == true ? "Tersedia" : "Terisi"));
        System.out.println("Pasien: " + (patient != null ? patient.getName() : "Tidak ada pasien"));
    }

}
