package controller;

import model.Doctor;
import utils.Global;



public class DoctorController {
    public static String editDoctorName(Doctor d){
        String newInput = Global.scanner.nextLine();
        d.setName(newInput);
        return "Nama berhasil diubah menjadi " + d.getName();
    }

    public static String editDoctorAge(Doctor d){
        System.out.print("Masukan Umur Baru: ");
        String newInput = Global.scanner.nextLine();
        try{
            int newAge = Integer.parseInt(newInput);
            d.setAge(newAge);
            return "Umur berhasil diubah menjadi " + d.getAge();
        } catch (NumberFormatException e) {
            return "Input umur tidak valid. Pastikan memasukkan angka.";
        }
    }
    
    public static String editDoctorGender(Doctor d){
        while (true) {
            System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
            String newInput = Global.scanner.nextLine();
            if (newInput.equalsIgnoreCase("Laki Laki") || newInput.equalsIgnoreCase("Perempuan")) {
                d.setGender(newInput);
                return "Jenis kelamin berhasil diubah menjadi " + d.getGender();
            } else {
                return "Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.";
            }
        }
    }

    public static String editDoctorAddress(Doctor d){
        String newInput = Global.scanner.nextLine();
        d.setAddress(newInput);
        return "Nama berhasil diubah menjadi " + d.getAddress();
    }

    public static String editDoctorContact(Doctor d){
        String newInput = Global.scanner.nextLine();
        d.setContact(newInput);
        return "Nama berhasil diubah menjadi " + d.getContact();
    }

    public static String editDoctorSpecialization(Doctor d){
        String newInput = Global.scanner.nextLine();
        d.setSpecialization(newInput);
        return "Nama berhasil diubah menjadi " + d.getSpecialization();
    }

    public static String editDoctorYearsOfExperience(Doctor d){
        System.out.print("Masukan tahun pengalaman baru: ");
        String newInput = Global.scanner.nextLine();
        try{
            int newYearsOfExperience = Integer.parseInt(newInput);
            d.setYearsOfExperience(newYearsOfExperience);
            return "Tahun pengalaman berhasil diubah menjadi " + d.getYearsOfExperience();
        } catch (NumberFormatException e) {
            return "Input tahun pengalaman tidak valid. Pastikan memasukkan angka.";
        }
    }

}
