package data;

import utils.Global;

public class Receptionist extends Person {

    public Receptionist(String name, int umur, String gender, String address, String contact, String receptionistId) {
        super(name, umur, gender, address, contact, receptionistId);
    }


    public void receptionistDisplay(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Jadwalkan Janji Temu");
            System.out.println("3. Assign dokter kepada pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    getDetail();
                    break;
                case 2:
                    scheduleAppointment();
                    break;
                case 3: 
                    assignDoctorToPatient();
                    break;

            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public void scheduleAppointment(){
        Global.scheduleAppointment();
    }

    public void assignDoctorToPatient(){
        System.out.println("Masukkan Id / Nama Dokter");
        String identifier = Global.scanner.nextLine();

        Doctor dokter = Global.searchDoctor(identifier);

        if(dokter == null){
            System.out.println("Data Dokter tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        System.out.println("Masukkan Id / Nama Pasien");
        identifier = Global.scanner.nextLine();
        Patient pasien = Global.searchPatient(identifier);


        if(pasien == null){
            System.out.println("Data Pasien tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        dokter.getDetail();
        pasien.getDetail();

        Global.assignDoctor(dokter, pasien);
    }

    public void assignNurseToPatient(){
        System.out.println("Masukkan Id / Nama Perawat");
        String identifier = Global.scanner.nextLine();

        Nurse nurse = Global.searchNurse(identifier);

        if(nurse == null){
            System.out.println("Data Perawat tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        System.out.println("Masukkan Id / Nama Pasien");
        identifier = Global.scanner.nextLine();
        Patient patient = Global.searchPatient(identifier);


        if(patient == null){
            System.out.println("Data Pasien tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        nurse.getDetail();
        patient.getDetail();

        Global.assignNurse(nurse, patient);
    }
}