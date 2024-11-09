package utils.display;

import data.Resepsionis;
import data.Dokter;
import data.Pasien;
import data.Ruangan;

import utils.Global;



public class DisplayResepsionis {
    // TODO
    public static void displayResepsionis(Resepsionis r){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Jadwalkan Janji Temu");
            System.out.println("3. Assign dokter kepada pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    r.getDetail();
                    break;
                case 2:
                    displayJadwalkanJanjiTemu(r);
                    break;
                case 3: 
                    DisplayPasien.displayAssignPasien();
                    break;

            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayJadwalkanJanjiTemu(Resepsionis rs){
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

        for(Ruangan ru : Global.daftarRuangan){
            if(ru.getIsTersedia().equals(true)){
                Global.jadwalkanJanjiTemu(dokter, pasien, ru, rs);
                return;
            }
        }

        System.out.println("Tidak ada ruangan yang tersedia, Janji Temu tidak bisa dijadwalkan");

    }
}
