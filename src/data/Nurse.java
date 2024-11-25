package data;

import java.util.ArrayList;

import utils.Global;

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
    public void getDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        System.out.println("Jenis Kelamin: " + getGender());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Nomor Kontak: " + getContact());
        System.out.println("Spesialisasi: " + specialization);
    }

    public void listPasienDirawat(){
        if(Global.doctorListPatient.containsKey(getId())){
            ArrayList<Patient> pasienList = Global.nurseListPatient.get(getId());
            int choice  = 1;
            int index = 0;
    
            if(pasienList.isEmpty()){
                System.out.println("Tidak ada pasien yang di assign ke anda");
                return;
            }
    
            while(choice != 0){
                System.out.println("====================================");
                Patient p = pasienList.get(index);
                p.getDetail();
                System.out.println("====================================");
    
                System.out.println("====================================");
                System.out.println("0. Keluar");
                System.out.println("1. Selanjutnya");
                System.out.println("2. Sebelumnya");
                System.out.println("3. Edit Keadaan Pasien"); 
                System.out.println("====================================");
                choice = Global.scanner.nextInt();
                Global.scanner.nextLine(); 
    
    
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        if(index < pasienList.size() - 1){
                            index++;
                        }                    
                        break;
                    case 2:
                        if(index > 0){
                            index--;
                        }
                        break;
                    case 3:
                        p.editPatientCondition();
                    default:
                        System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                        break;
                }
            }
        }
        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }

}