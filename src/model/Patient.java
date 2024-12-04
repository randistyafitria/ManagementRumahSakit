package model;

public class Patient extends Person {
    private String medicalHistory;
    private String currentCondition;
    private Room treatmentRoom = null;

    public Patient(String name, int age, String gender, String address, String contact, String patientId, String medicalHistory, String currentCondition) {
        super(name, age, gender, address, contact, patientId);
        this.medicalHistory = medicalHistory;
        this.currentCondition = currentCondition;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public Room getTreatmentRoom() {
        return treatmentRoom;
    }


    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void setTreatmentRoom(Room treatmentRoom) {
        this.treatmentRoom = treatmentRoom;
    }

    @Override
    public String getDetail() {
        if(treatmentRoom != null){
            return "ID: " + getId() + "\n" +
            "Nama: " + getName() + "\n" +
            "Umur: " + getAge() + "\n" +
            "Jenis Kelamin: " + getGender() + "\n" +
            "Alamat: " + getAddress() + "\n" +
            "Nomor Kontak: " + getContact() + "\n" +
            "Riwayat Medis: " + medicalHistory + "\n" +
            "Kondisi Saat Ini : " + currentCondition + 
            "Saat ini sedang dirawat di ruangan: " + treatmentRoom.getRoomNumber();
        }
        
        return "ID: " + getId() + "\n" +
        "Nama: " + getName() + "\n" +
        "Umur: " + getAge() + "\n" +
        "Jenis Kelamin: " + getGender() + "\n" +
        "Alamat: " + getAddress() + "\n" +
        "Nomor Kontak: " + getContact() + "\n" +
        "Riwayat Medis: " + medicalHistory + "\n" +
        "Kondisi Saat Ini : " + currentCondition + 
        "Sedang tidak dirawat di ruangan";
    }
}
