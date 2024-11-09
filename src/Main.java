import utils.Global;

import utils.auth.AuthDokter;
import utils.auth.AuthPasien;
import utils.auth.AuthResepsionis;

import utils.display.DisplayAdmin;
import utils.display.DisplayDokter;
import utils.display.DisplayPasien;
import utils.display.DisplayResepsionis;

import test.Init;

import data.Pasien;
import data.Dokter;
import data.Resepsionis;



public class Main {
    public static void main(String[] args) {
        Init.init();
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
                    Pasien p = AuthPasien.auth();
                    if(p == null){
                        System.out.println("Data Pasien tidak ditemukan");
                        break;
                    }
                    DisplayPasien.displayPasien(p);
                    break;

                case 2:
                    Dokter d = AuthDokter.auth();
                    if(d == null){
                        System.out.println("Data Dokter tidak ditemukan");
                        break;
                    }
                    DisplayDokter.displayDokter(d);                    
                    break;

                case 3:
                    Resepsionis r = AuthResepsionis.auth();
                    if(r == null){
                        System.out.println("Data Resepsionis tidak ditemukan");
                        break;
                    }
                    DisplayResepsionis.displayResepsionis(r);                    
                    break;

                case 4:
                    DisplayAdmin.displayAdmin();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
        
        Global.scanner.close();
    }
}