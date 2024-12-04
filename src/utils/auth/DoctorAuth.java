package utils.auth;

import model.Doctor;
import utils.Global;

public class DoctorAuth {
    public static Doctor auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        return Global.searchDoctor(identifier);
        
    }
}
