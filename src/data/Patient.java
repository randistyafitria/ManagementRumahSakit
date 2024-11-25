package data;

import java.util.List;

import utils.Global;

public class Patient extends Person {
    private String medicalHistory;
    private String currentCondition;
    private Room treatmentRoom = null;

    public Patient(String name, int age, String gender, String address, String contact, String patientId, String medicalHistory, String currentCondition) {
        super(name, age, gender, address, contact, patientId);
        this.medicalHistory = medicalHistory;
        this.currentCondition = currentCondition;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public Room getTreatmentRoom() {
        return treatmentRoom;
    }


    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void setTreatmentRoom(Room treatmentRoom) {
        this.treatmentRoom = treatmentRoom;
    }

    @Override
    public void getDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getName());
        System.out.println("Umur: " + getAge());
        System.out.println("Jenis Kelamin: " + getGender());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Nomor Kontak: " + getContact());
        System.out.println("Riwayat Medis: " + medicalHistory);
        System.out.println("Kondisi Saat Ini: " + currentCondition);

        if(treatmentRoom != null){
            System.out.println("Saat ini sedang dirawat di ruangan: " + treatmentRoom.getRoomNumber());
            return;
        }
        System.out.println("Sedang tidak dirawat di ruangan");
    }

    public void patientDisplay(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu Aktif");
            System.out.println("3. Lihat Jadwal Janji Temu Pending");
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
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }



    //temp, add so it can go left, right
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
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //need fix, same with the dokter one, 
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
                    currJt.patientAcceptAppointment();
                    break;
                case 4: 
                    currJt.patientRejectAppointment();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    public void editPatient(){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
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
                        System.out.print("Umur berhasil diubah menjadi " + getAge());
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
                            System.out.print("Jenis kelamin berhasil diubah menjadi " + getGender());
                            break;
                        } else {
                            System.out.println("Input tidak valid. Silakan masukkan 'Laki Laki' atau 'Perempuan'.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukan address baru: ");
                    newInput = Global.scanner.nextLine();
                    setAddress(newInput);
                    System.out.println("Nama berhasil diubah menjadi " + getAddress());
                    break;
                case 5:
                    System.out.print("Masukan nomor kontak baru: ");
                    newInput = Global.scanner.nextLine();
                    setContact(newInput);
                    System.out.println("Nama berhasil diubah menjadi " + getContact());
                    break;
                case 6:
                    System.out.print("Masukan riwayat medis Baru: ");
                    newInput = Global.scanner.nextLine();
                    setMedicalHistory(newInput);
                    System.out.println("Riwayat medis berhasil diubah menjadi " + medicalHistory);
                    break;

                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    //TODO: Error handling
    public void editPatientCondition (){
        System.out.println("Keadaan Pasien saat ini: " + currentCondition);
        System.out.print("Silahkan input kondisi pasien yang terbaru: ");
        String newCondition = Global.scanner.nextLine();

        setCurrentCondition(newCondition);
    }


}
