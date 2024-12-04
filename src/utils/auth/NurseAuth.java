package utils.auth;

import model.Nurse;
import utils.Global;

public class NurseAuth {
    public static Nurse auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        return Global.searchNurse(identifier);
        
    }
}
