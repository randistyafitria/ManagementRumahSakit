import data.*;
import java.util.LinkedList;
import java.util.Scanner;
import utils.Global;

public class Main {
    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println("====================================");
            System.out.println("=         BY ; Kelompok 2          =");
            System.out.println("====================================");
            System.out.println("=   Sistem Manajemen Rumah Sakit   =");
            System.out.println("====================================");
            System.out.println("= 1. Tambah Dokter                 =");
            System.out.println("= 2. Tambah Pasien                 =");
            System.out.println("= 3. Tambah Perawat                =");
            System.out.println("= 4. Tambah Resepsionis            =");
            System.out.println("= 5. Tambah Ruangan                =");
            System.out.println("= 6. Jadwalkan Janji Temu          =");
            System.out.println("= 7. Keluar                        =");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            int pilihan = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (pilihan) {
                case 1:
                Global.tambahDokter(Global.daftarDokter);
                    break;
                case 2:
                Global.tambahPasien(Global.daftarPasien);
                    break;
                case 3:
                Global.tambahPerawat(Global.daftarPerawat);
                    break;
                case 4:
                Global.tambahResepsionis(Global.daftarResepsionis);
                    break;
                case 5:
                Global.tambahRuangan(Global.daftarRuangan);
                    break;
                case 6:
                Global.jadwalkanJanjiTemu(Global.daftarDokter, Global.daftarPasien, Global.daftarResepsionis, Global.daftarRuangan);
                    break;
                case 7:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        Global.scanner.close();
    }
}