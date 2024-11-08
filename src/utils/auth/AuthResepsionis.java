package utils.auth;

import data.Resepsionis;
import utils.Global;

public class AuthResepsionis {
    public static Resepsionis auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        identifier = identifier.trim();

        for(Resepsionis r : Global.daftarResepsionis){
            if(r.getId().equals(identifier) || r.getNama().equals(identifier)){
                return r;
            }
        }
        
        return null;
    }
}
