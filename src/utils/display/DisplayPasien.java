package utils.display;

import data.Pasien;
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

            switch (choice) {
                case 0:
                    break;
                case 1:
                    p.getDetail();
                    break;
                case 2:
                    break;
                
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAssignPasien(){
        System.out.print("Masukkan ID Dokter yang akan di assign: ");
        String idDokter = Global.scanner.nextLine();

        if(!Global.dokterListPasien.containsKey(idDokter)){
            System.out.println("Dokter tidak berhasil ditemukan");
        }
    }
}
