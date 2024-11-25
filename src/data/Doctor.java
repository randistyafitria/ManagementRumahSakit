package data;

import java.util.ArrayList;
import java.util.List;

import utils.Global;

public class Doctor extends Person {
    private String specialization;
    private int yearsOfExperience;

    public Doctor(String name, int age, String gender, String address, String contact, String id, String specialization, int yearsOfExperience) {
        super(name, age, gender, address, contact, id);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void getDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        System.out.println("Jenis Kelamin: " + getGender());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Nomor Kontak: " + getContact());
        System.out.println("Spesialisasi: " + specialization);
        System.out.println("Tahun Pengalaman: " + yearsOfExperience + " Tahun");
    }



    public void doctorDisplay(){
        int choice = 1;
        while(choice != 0){
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
                    getDetail();
                    break;
                case 2:
                    listActiveAppointment();
                    break;
                case 3: 
                    listPendingAppointment();
                    break;
                case 4: 
                    listTreatedPatients();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //need fix
    //harusnya hanya tampilkan yang sesuai dengan identifiernya, yang hanya janji temu milik dokter ini
    public void listPendingAppointment(){
        int choice = 1;
        int index = 0;

        List<Appointment> listPendingAppointment = Global.getFilteredPendingAppointments(getId());

        if(listPendingAppointment.isEmpty()){
            System.out.println("Tidak ada janji temu yang belum disetujui");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            Appointment currJt = listPendingAppointment.get(index);
            currJt.getDetail();
            System.out.println(currJt.getAgrementStatus());
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
                    currJt.doctorAcceptAppointment();
                    break;
                case 4: 
                    currJt.doctorRejectAppointment();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }    
    }

    public void listTreatedPatients(){
        if(Global.doctorListPatient.containsKey(getId())){
            ArrayList<Patient> pasienList = Global.doctorListPatient.get(getId());
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
                //4 Jadwalkan Janji temu dengan pasien????? idk
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
                        p.editPatientCondition();
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

    public void listActiveAppointment(){
        int choice = 1;
        int index = 0;


        List<Appointment> listActiveAppointment = Global.getFilteredActiveAppointments(getId());


        if(listActiveAppointment.isEmpty()){
            System.out.println("Anda tidak mempunyai janji temu yang sedang aktif");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            Appointment currJt = listActiveAppointment.get(index);
            currJt.getDetail();
            System.out.println(currJt.getAgrementStatus());
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("3. Batalkan Janji Temu");
            System.out.println("4. Reschedule Janji Temu"); // nanti aja, terakhiran kalaau ga malas
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
                    currJt.cancelAppointment();
                    return;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public void editDoctor(){
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
            
            String newInput = "";
            switch (choice) {
                case 0:
                    break;

                case 1:
                    System.out.print("Masukan Nama Baru: ");
                    newInput = Global.scanner.nextLine();
                    setName(newInput);
                    System.out.println("Nama berhasil diubah menjadi " + getName());
                    break;

                case 2:
                    System.out.print("Masukan Umur Baru: ");
                    newInput = Global.scanner.nextLine();
                    try{
                        int newAge = Integer.parseInt(newInput);
                        setAge(newAge);
                        System.out.println("Umur berhasil diubah menjadi " + getAge());
                    } catch (NumberFormatException e) {
                        System.out.println("Input age tidak valid. Pastikan memasukkan angka.");
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.print("Masukkan jenis kelamin baru (Laki Laki/Perempuan): ");
                        newInput = Global.scanner.nextLine();
                        if (newInput.equalsIgnoreCase("Laki Laki") || newInput.equalsIgnoreCase("Perempuan")) {
                            setGender(newInput);
                            System.out.println("Jenis kelamin berhasil diubah menjadi " + getGender());
                            break;
                        } else {
                            System.out.println("Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukan alamat baru: ");
                    newInput = Global.scanner.nextLine();
                    setAddress(newInput);
                    System.out.println("Nama berhasil diubah menjadi " + getAddress());
                    break;

                case 5:
                    System.out.print("Masukan nomor kontak baru: ");
                    newInput = Global.scanner.nextLine();
                    setContact(newInput);
                    System.out.println("Nomor Kontak berhasil diubah menjadi " + getContact());
                    break;

                case 6:
                    System.out.print("Masukan spesialisasi baru: ");
                    newInput = Global.scanner.nextLine();
                    setSpecialization(newInput);
                    System.out.println("Spesialisasi berhasil diubah menjadi " + specialization);

                case 7:
                    System.out.print("Masukan tahun pengalaman baru: ");
                    newInput = Global.scanner.nextLine();
                    try{
                        int newYearsOfExperience = Integer.parseInt(newInput);
                        setYearsOfExperience(newYearsOfExperience);
                        System.out.println("Tahun pengalaman berhasil diubah menjadi " + yearsOfExperience);
                    } catch (NumberFormatException e) {
                        System.out.println("Input tahun pengalaman tidak valid. Pastikan memasukkan angka.");
                    }
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }
}
