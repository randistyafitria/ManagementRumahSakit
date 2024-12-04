package view;

import utils.Global;
import model.Receptionist;

import controller.ReceptionistController;

public class ReceptionsitView{
    public static void receptionistDisplay(Receptionist r){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Jadwalkan Janji Temu");
            System.out.println("3. Assign dokter kepada pasien");
            System.out.println("4. Assign dokter kepada pasien");
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
                    ReceptionistController.scheduleAppointment();
                    break;
                case 3: 
                    ReceptionistController.assignDoctorToPatient();
                    break;
                case 4: 
                    ReceptionistController.assignNurseToPatient();
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void scheduelAppointment(){

    }
}