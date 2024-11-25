package data;

import java.util.Date;
import java.text.SimpleDateFormat;
import utils.Global;

public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private Doctor doctor;
    private Patient patient;

    private boolean patientAgreement = false;
    private boolean doctorAgreement = false;



    public Appointment(String idJanjiTemu, Date appointmentDate, Doctor doctor, Patient patient) {
        this.appointmentId = idJanjiTemu;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Patient getPatient(){
        return patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public String getAppointmentId(){
        return appointmentId;
    }

    public Date getAppointmentDate(){
        return appointmentDate;
    }

    public void appointmentConfirmation() {
        System.out.println("Janji temu antara patient " + patient.getName() + " dengan doctor " + doctor.getName() + " telah dikonfirmasi.");
    }

    public void getDetail(){
        System.out.println("Tanggal: " + new SimpleDateFormat("dd MM yyyy").format(appointmentDate));
        System.out.println("Dokter: " + doctor.getName());
        System.out.println("Pasien: " + patient.getName());
    }

    public void patientAcceptAppointment(){
        patientAgreement = true;
        checkAgreement();
    }

    public void patientRejectAppointment(){
        patientAgreement = false;
        checkAgreement();
    }


    public void doctorAcceptAppointment(){
        doctorAgreement = true;
        checkAgreement();
    }

    public void doctorRejectAppointment(){
        doctorAgreement = false;
        checkAgreement();
    }


    public void checkAgreement(){
        if(doctorAgreement == true && patientAgreement == true){
            Global.activeAppointmentList.add(this);
            Global.pendingAppointmentList.remove(this);
        }
        else{
            Global.activeAppointmentList.remove(this);
            Global.pendingAppointmentList.add(this);
        }
    }

    public String getAgrementStatus(){
        if (doctorAgreement == true && patientAgreement == false) {
            return "Dokter sudah menyetujui Janji Temu ini, namun patient belum!";
        } else if (doctorAgreement == false && patientAgreement == false) {
            return "Dokter dan patient belum menyetujui Janji Temu ini!";
        } else if (doctorAgreement == true && patientAgreement == true) {
            return "Dokter dan patient sudah menyetujui Janji Temu ini!";
        } else if (doctorAgreement == false && patientAgreement == true) {
            return "Pasien sudah menyetujui Janji Temu ini, namun doctor belum!";
        }
        return "Status persetujuan tidak dapat ditentukan.";
    }

    public void cancelAppointment(){
        Global.activeAppointmentList.remove(this);
    }

    //TODO: mungkin bisa dieksekusi doctor sama resepsionis? sama mungkin admin? apa gausah? malas 
    public void reschedueAppointment(){

    }

}