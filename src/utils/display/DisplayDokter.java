package utils.display;

import data.Dokter;
import data.JanjiTemu;
import utils.Global;
import data.Pasien;

import java.util.ArrayList;

public class DisplayDokter {
    // TODO
    public static void displayDokter(Dokter d){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu");
            System.out.println("3. Lihat Keadaan Pasien"); // TODO: make this to kelola pasien -> can change pasien details, and perhaps also buat jadwal janji temu
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    d.getDetail();
                    break;
                case 2:
                    for(JanjiTemu jt : Global.daftarJanjiTemu){
                        if(jt.getDokter().equals(d)){
                            jt.getDetail();
                        }
                    }
                    break;
                case 3: 
                    displayPasienDokter(d);
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayPasienDokter(Dokter d){
        
        if(Global.dokterListPasien.containsKey(d.getId())){
            ArrayList<Pasien> pasienList = Global.dokterListPasien.get(d.getId());

            for(Pasien p : pasienList){
                p.getDetail();
            }
        }
        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }
}
