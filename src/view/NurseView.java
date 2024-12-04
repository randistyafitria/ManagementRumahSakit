package view;

import java.util.ArrayList;

import model.Patient;
import model.Nurse;
import utils.Global;

public class NurseView{
    public void listPasienDirawat(Nurse n){
        if(Global.doctorListPatient.containsKey(n.getId())){
            ArrayList<Patient> pasienList = Global.nurseListPatient.get(n.getId());
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
}