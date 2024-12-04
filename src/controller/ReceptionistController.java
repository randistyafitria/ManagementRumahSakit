package controller;

import model.Doctor;
import model.Nurse;
import model.Patient;
import utils.Global;

public class ReceptionistController{
    public static void scheduleAppointment(){
        Global.scheduleAppointment();
    }
    
    public static void assignDoctorToPatient(){
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

    public static void assignNurseToPatient(){
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