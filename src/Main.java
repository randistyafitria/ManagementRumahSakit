import utils.Global;
import utils.auth.AuthDokter;
import utils.auth.AuthPasien;
import utils.auth.AuthResepsionis;
import utils.Display;
import utils.*;

import test.Init;


public class Main {
    public static void main(String[] args) {
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("=         BY ; Kelompok 2          =");
            System.out.println("====================================");
            System.out.println("=   Sistem Manajemen Rumah Sakit   =");
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Pasien");
            System.out.println("2. Dokter");
            System.out.println("3. Resepsionis");
            System.out.println("4. Admin");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    AuthPasien.auth();
                    break;
                case 2:
                    AuthDokter.auth();
                    break;
                case 3:
                    AuthResepsionis.auth();
                    break;
                case 4:
                    Display.displayAdmin();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
        
        Global.scanner.close();
    }
}