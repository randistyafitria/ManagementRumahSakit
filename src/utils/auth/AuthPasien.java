package utils.auth;

import utils.Global;
import data.Pasien;

public class AuthPasien {

    public static Pasien auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        return Global.searchPasien(identifier);
        
    }
}
