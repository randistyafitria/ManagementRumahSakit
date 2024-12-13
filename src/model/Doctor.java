package model;

public class Doctor extends Person implements MedicalStaff{
    private String specialization;
    private int yearsOfExperience;

    public Doctor(String name, int age, String gender, String address, String contact, String id, String specialization, int yearsOfExperience) {
        super(name, age, gender, address, contact, id);
        if (yearsOfExperience < MIN_YEARS_OF_EXPERIENCE) {
            throw new IllegalArgumentException("Years of experience cannot be less than " + MIN_YEARS_OF_EXPERIENCE + " years.");
        }
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getDetail() {
        return "ID: " + getId() + "\n" +
               "Nama: " + getName() + "\n" +
               "Umur: " + getAge() + "\n" +
               "Jenis Kelamin: " + getGender() + "\n" +
               "Alamat: " + getAddress() + "\n" +
               "Nomor Kontak: " + getContact() + "\n" +
               "Spesialisasi: " + specialization + "\n" +
               "Tahun Pengalaman: " + yearsOfExperience + " Tahun";
    }
    
}
