package utils.display;

import data.Resepsionis;
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

            switch (choice) {
                case 0:
                    break;
                case 1:
                    r.getDetail();
                    break;
                case 2:
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
}
