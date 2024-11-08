package utils;

public class Display {
    public static void init(){
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

            switch (choice) {
                case 0:
                    // displayPasien();
                    break;
                case 1:
                    // displayDokter();
                    break;
                case 2:
                    // displayDokter();
                    break;
                case 3:
                    // displayResepsionis();
                    break;
                case 4:
                    displayAdmin();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }
    public static void displayAdmin(){
        boolean running = true;
    
        while (running) {
            System.out.println("====================================");
            System.out.println(" 1. Tambah Dokter                 ");
            System.out.println(" 2. Tambah Pasien                 ");
            System.out.println(" 3. Tambah Perawat                ");
            System.out.println(" 4. Tambah Resepsionis            ");
            System.out.println(" 5. Tambah Ruangan                ");
            System.out.println(" 6. Jadwalkan Janji Temu          ");
            System.out.println(" 0. Keluar                        ");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            int pilihan = Global.scanner.nextInt();
            Global.scanner.nextLine();
    
            switch (pilihan) {
                case 1:
                    Global.tambahDokter();
                    break;
                case 2:
                    Global.tambahPasien();
                    break;
                case 3:
                    Global.tambahPerawat();
                    break;
                case 4:
                    Global.tambahResepsionis();
                    break;
                case 5:
                    Global.tambahRuangan();
                    break;
                case 6:
                    Global.jadwalkanJanjiTemu();
                    break;
                case 0:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
}
