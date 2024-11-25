package utils.auth;

import utils.Global;
import data.Patient;

public class PatientAuth {

    public static Patient auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        return Global.searchPatient(identifier);
        
    }
}
