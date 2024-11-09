package utils.auth;

import data.Dokter;
import utils.Global;

public class AuthDokter {
    public static Dokter auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        return Global.searchDokter(identifier);
        
    }
}
