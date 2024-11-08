package utils;

public class Display {
    // TODO
    public static void displayAdmin(){
        boolean running = true;
    
        while (running) {
            System.out.println("====================================");
            System.out.println(" 0. Keluar                        ");
            System.out.println(" 1. Kelola Dokter                 ");
            System.out.println(" 2. Kelola Pasien                 ");
            System.out.println(" 3. Kelola Perawat                ");
            System.out.println(" 4. Kelola Resepsionis            ");
            System.out.println(" 5. Kelola Ruangan                ");
            System.out.println(" 6. Kelola Janji Temu             ");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            int pilihan = Global.scanner.nextInt();
            Global.scanner.nextLine();
    
            switch (pilihan) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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

    // TODO
    public static void displayPasien(){
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
                    break;
                case 2:
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    // TODO
    public static void displayDokter(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu");
            System.out.println("3. Lihat Keadaan Pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    // TODO
    public static void displayResepsionis(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Jadwalkan Janji Temu");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }
    
}
