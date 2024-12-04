package view;

import java.util.ArrayList;
import java.util.List;

import controller.AppointmentController;
import controller.DoctorController;

import model.Appointment;
import model.Doctor;
import model.Patient;

import utils.Global;

public class DoctorView {
    public static void displayDoctorDetails(Doctor d) {
        System.out.println("====================================");
        System.out.println("Profil Dokter:");
        System.out.println(d.getDetail());
        System.out.println("====================================");
    }

    public static void displayMenu(Doctor d) {
        int choice = 1;
        while (choice != 0) {
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu Aktif");
            System.out.println("3. Lihat Jadwal Janji Temu Pending");
            System.out.println("4. Kelola Pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayDoctorDetails(d);
                    break;
                case 2:
                    listActiveAppointment(d);
                    break;
                case 3:
                    listPendingAppointment(d);
                    break;
                case 4:
                    listTreatedPatient(d);
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void listPendingAppointment(Doctor d){
        int choice = 1;
        int index = 0;

        List<Appointment> listPendingAppointment = Global.getFilteredPendingAppointments(d.getId());

        if(listPendingAppointment.isEmpty()){
            System.out.println("Tidak ada janji temu yang belum disetujui");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            Appointment currAp = listPendingAppointment.get(index);
            AppointmentView.getDetail(currAp);
            System.out.println(currAp.getAgreementStatus());
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("3. Setujui Janji Temu");
            System.out.println("4. Tolak Janji Temu");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 


            switch (choice) {
                case 0:
                    break;
                case 1:
                    if(index < listPendingAppointment.size() - 1){
                        index++;
                    }                    
                    break;
                case 2:
                    if(index > 0){
                        index--;
                    }
                    break;
                case 3: 
                    currAp.setDoctorAgreement(true);
                    break;
                case 4: 
                    currAp.setDoctorAgreement(false);
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }    
    }

    public static void listTreatedPatient(Doctor d){
        if(Global.doctorListPatient.containsKey(d.getId())){
            ArrayList<Patient> pasienList = Global.doctorListPatient.get(d.getId());
            int choice  = 1;
            int index = 0;
    
            if(pasienList.isEmpty()){
                System.out.println("Tidak ada pasien yang di assign ke anda");
                return;
            }
    
            while(choice != 0){
                System.out.println("====================================");
                Patient p = pasienList.get(index);
                p.getDetail();
                System.out.println("====================================");
    
                System.out.println("====================================");
                System.out.println("0. Keluar");
                System.out.println("1. Selanjutnya");
                System.out.println("2. Sebelumnya");
                System.out.println("3. Edit Keadaan Pasien"); 
                System.out.println("====================================");
                choice = Global.scanner.nextInt();
                Global.scanner.nextLine(); 
    
    
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        if(index < pasienList.size() - 1){
                            index++;
                        }                    
                        break;
                    case 2:
                        if(index > 0){
                            index--;
                        }
                        break;
                    case 3:
                        PatientView.editPatientConditionDisplay(p);
                    default:
                        System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                        break;
                }
            }
        }
        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }

    public static void listActiveAppointment(Doctor d){
        int choice = 1;
        int index = 0;
        List<Appointment> listActiveAppointment = Global.getFilteredActiveAppointments(d.getId());

        if(listActiveAppointment.isEmpty()){
            System.out.println("Anda tidak mempunyai janji temu yang sedang aktif");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            Appointment currAp = listActiveAppointment.get(index);
            AppointmentView.getDetail(currAp);
            System.out.println(currAp.getAgreementStatus());
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("3. Batalkan Janji Temu");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 


            switch (choice) {
                case 0:
                    break;
                case 1:
                    if(index < listActiveAppointment.size() - 1){
                        index++;
                    }                    
                    break;
                case 2:
                    if(index > 0){
                        index--;
                    }
                    break;
                case 3: 
                    AppointmentController.cancelAppointment(currAp);
                    return;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    public static void editDoctor(Doctor d){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
            System.out.println("6. Edit Spesialisasi");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();
            
            switch (choice) {
                case 0:
                    break;

                case 1:
                    System.out.println(DoctorController.editDoctorName(d));
                    break;

                case 2:
                    System.out.println(DoctorController.editDoctorAge(d));

                    break;

                case 3:
                    System.out.println(DoctorController.editDoctorGender(d));
                    break;

                case 4:
                    System.out.println(DoctorController.editDoctorAddress(d));
                    break;

                case 5:
                    System.out.println(DoctorController.editDoctorContact(d));
                    break;

                case 6:
                    System.out.println(DoctorController.editDoctorSpecialization(d));
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


}
