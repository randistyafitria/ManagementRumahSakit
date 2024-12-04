package controller;

import utils.Global;
import model.Patient;

public class PatientController{
    public static String editPatientName(Patient p){
        System.out.print("Masukan Nama Baru: ");
        String newInput = Global.scanner.nextLine();
        p.setName(newInput);
        return "Nama berhasil diubah menjadi " + p.getName();
    }

    public static String editPatientAge(Patient p){
        System.out.print("Masukan Umur Baru: ");
        String newInput = Global.scanner.nextLine();
        try{
            int newAge = Integer.parseInt(newInput);
            p.setAge(newAge);
            return "Umur berhasil diubah menjadi " + p.getAge();
        } catch (NumberFormatException e) {
            return "Input umur tidak valid. Pastikan memasukkan angka.";
        }
    }
    public static String editPatientGender(Patient p){
        while (true) {
            System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
            String newInput = Global.scanner.nextLine();
            if (newInput.equalsIgnoreCase("Laki Laki") || newInput.equalsIgnoreCase("Perempuan")) {
                p.setGender(newInput);
                return "Jenis kelamin berhasil diubah menjadi " + p.getGender();
            } else {
                return "Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.";
            }
        }
    }
    public static String editPatientAddress(Patient p){
        System.out.print("Masukan Alamat Baru: ");
        String newInput = Global.scanner.nextLine();
        p.setAddress(newInput);
        return "Alamat berhasil diubah menjadi " + p.getAddress();
    }
    public static String editPatientContact(Patient p){
        System.out.print("Masukan Nomor Kontak Baru: ");
        String newInput = Global.scanner.nextLine();
        p.setContact(newInput);
        return "Alamat berhasil diubah menjadi " + p.getContact();
    }
    public static String editPatientCurrentCondition(Patient p){
        System.out.print("Masukan kondisi pasien terkini: ");
        String newInput = Global.scanner.nextLine();
        p.setCurrentCondition(newInput);
        return "Kondisi pasien saat ini diubah menjadi " + p.getCurrentCondition(); 
    }

    public static String editPatientMedicalHistory(Patient p){
        System.out.print("Masukkan riwayat kesehatan: ");
        String newInput = Global.scanner.nextLine();
        p.setMedicalHistory(newInput);
        return "Riwayat Kesehatan diubah menjadi " + p.getMedicalHistory(); 
    }

    

}