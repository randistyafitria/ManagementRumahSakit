package controller;

import model.Doctor;
import model.Nurse;
import model.Patient;
import model.Receptionist;

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


    public static String editReceptionistName(Receptionist re){
        String newInput = Global.scanner.nextLine();
        re.setName(newInput);
        return "Nama berhasil diubah menjadi " + re.getName();
    }

    public static String editReceptionistAge(Receptionist re){
        System.out.print("Masukan Umur Baru: ");
        String newInput = Global.scanner.nextLine();
        try{
            int newAge = Integer.parseInt(newInput);
            re.setAge(newAge);
            return "Umur berhasil diubah menjadi " + re.getAge();
        } catch (NumberFormatException e) {
            return "Input umur tidak valid. Pastikan memasukkan angka.";
        }
    }
    
    public static String editReceptionistGender(Receptionist re){
        while (true) {
            System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
            String newInput = Global.scanner.nextLine();
            if (newInput.equalsIgnoreCase("Laki Laki") || newInput.equalsIgnoreCase("Perempuan")) {
                re.setGender(newInput);
                return "Jenis kelamin berhasil diubah menjadi " + re.getGender();
            } else {
                return "Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.";
            }
        }
    }

    public static String editReceptionistAddress(Receptionist re){
        String newInput = Global.scanner.nextLine();
        re.setAddress(newInput);
        return "Nama berhasil diubah menjadi " + re.getAddress();
    }


    public static String editReceptionistContact(Receptionist re){
        String newInput = Global.scanner.nextLine();
        re.setContact(newInput);
        return "Nama berhasil diubah menjadi " + re.getContact();
    }
}