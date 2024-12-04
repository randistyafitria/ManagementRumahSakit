package utils.auth;

import model.Receptionist;
import utils.Global;

public class ReceptionistAuth {
    public static Receptionist auth(){
        System.out.println("Masukkan ID / Nama anda yang sudah terdaftar");
        String identifier = Global.scanner.nextLine();

        identifier = identifier.trim();

        for(Receptionist r : Global.receptionistList){
            if(r.getId().equals(identifier) || r.getName().equals(identifier)){
                return r;
            }
        }
        
        return null;
    }
}
