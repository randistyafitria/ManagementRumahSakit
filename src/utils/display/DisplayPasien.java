package utils.display;

import data.Pasien;
import data.Ruangan;
import data.Dokter;
import data.JanjiTemu;

import utils.Global;

public class DisplayPasien {
    public static void displayPasien(Pasien p){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();


            switch (choice) {
                case 0:
                    break;
                case 1:
                    p.getDetail();
                    break;
                case 2:
                    for(JanjiTemu jt : Global.daftarJanjiTemu){
                        if(jt.getPasien().equals(p)){
                            jt.getDetail();
                        }
                    }
                    break;
                
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAssignPasien(){
        System.out.println("Masukkan Id / Nama Dokter");
        String identifier = Global.scanner.nextLine();

        Dokter dokter = Global.searchDokter(identifier);

        if(dokter == null){
            System.out.println("Data Dokter tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        System.out.println("Masukkan Id / Nama Pasien");
        identifier = Global.scanner.nextLine();
        Pasien pasien = Global.searchPasien(identifier);


        if(pasien == null){
            System.out.println("Data Pasien tidak ditemukan, Mohon ulangi operasi lagi");
            return;
        }

        dokter.getDetail();
        pasien.getDetail();

        Global.assignDokter(dokter, pasien);
    }
}
