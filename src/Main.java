import utils.DisplayAdmin;
import utils.Global;

import utils.auth.DoctorAuth;
import utils.auth.PatientAuth;
import utils.auth.ReceptionistAuth;
import test.Init;

import data.Patient;
import data.Doctor;
import data.Receptionist;



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
                    Patient p = PatientAuth.auth();

                    if(p == null){
                        
                        System.out.println("Data Pasien tidak ditemukan");
                        break;
                    }
                    p.patientDisplay();
                    break;

                case 2:
                    Doctor d = DoctorAuth.auth();
                    if(d == null){
                        System.out.println("Data Dokter tidak ditemukan");
                        break;
                    }
                    d.doctorDisplay();
                    break;

                case 3:
                    Receptionist r = ReceptionistAuth.auth();
                    if(r == null){
                        System.out.println("Data Resepsionis tidak ditemukan");
                        break;
                    }
                    r.receptionistDisplay();
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