package model;

public class Nurse extends Person {
    private String specialization;

    public Nurse(String name, int age, String gender, String address, String contact, String nurseId, String specialization) {
        super(name, age, gender, address, contact ,nurseId);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }


    @Override
    public String getDetail() {
        return "ID: " + getId() + "\n" +
               "Nama: " + getName() + "\n" +
               "Umur: " + getAge() + "\n" +
               "Jenis Kelamin: " + getGender() + "\n" +
               "Alamat: " + getAddress() + "\n" +
               "Nomor Kontak: " + getContact() + "\n" +
               "Spesialisasi: " + specialization + "\n";
    }

}