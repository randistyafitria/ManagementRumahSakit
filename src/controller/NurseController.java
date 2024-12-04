package controller;

import model.Nurse;
import utils.Global;

public class NurseController{
    public static String editNurseName(Nurse n){
        System.out.print("Masukan Nama Baru: ");
        String newInput = Global.scanner.nextLine();
        n.setName(newInput);
        return "Nama berhasil diubah menjadi " + n.getName();
    }

    public static String editNurseAge(Nurse n){
        System.out.print("Masukan Umur Baru: ");
        String newInput = Global.scanner.nextLine();
        try{
            int newAge = Integer.parseInt(newInput);
            n.setAge(newAge);
            return "Umur berhasil diubah menjadi " + n.getAge();
        } catch (NumberFormatException e) {
            return "Input umur tidak valid. Pastikan memasukkan angka.";
        }
    }
    public static String editNurseGender(Nurse n){
        while (true) {
            System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
            String newInput = Global.scanner.nextLine();
            if (newInput.equalsIgnoreCase("Laki Laki") || newInput.equalsIgnoreCase("Perempuan")) {
                n.setGender(newInput);
                return "Jenis kelamin berhasil diubah menjadi " + n.getGender();
            } else {
                return "Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.";
            }
        }
    }
    public static String editNurseAddress(Nurse n){
        System.out.print("Masukan Alamat Baru: ");
        String newInput = Global.scanner.nextLine();
        n.setAddress(newInput);
        return "Alamat berhasil diubah menjadi " + n.getAddress();
    }

    public static String editNurseContact(Nurse n){
        System.out.print("Masukan Nomor Kontak Baru: ");
        String newInput = Global.scanner.nextLine();
        n.setContact(newInput);
        return "Alamat berhasil diubah menjadi " + n.getContact();
    }

    public static String editNurseSpecialization(Nurse n){
        String newInput = Global.scanner.nextLine();
        n.setSpecialization(newInput);
        return "Nama berhasil diubah menjadi " + n.getSpecialization();
    }
    

}