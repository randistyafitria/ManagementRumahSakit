package view;

import model.Appointment;
import java.text.SimpleDateFormat;

public class AppointmentView {

    public static void getDetail(Appointment ap) {
        System.out.println("Detail Janji Temu:");
        System.out.println("ID: " + ap.getAppointmentId());
        System.out.println("Tanggal: " + new SimpleDateFormat("dd MM yyyy").format(ap.getAppointmentDate()));
        System.out.println("Dokter: " + ap.getDoctor().getName());
        System.out.println("Pasien: " + ap.getPatient().getName());
    }

    public static void displayConfirmationMessage(Appointment ap) {
        System.out.println("Janji temu antara pasien " + ap.getPatient().getName() +
                " dengan doctor " + ap.getDoctor().getName() + " telah dikonfirmasi.");
    }

    public static void displayAgreementStatus(Appointment ap) {
        System.out.println("Status: " + ap.getAgreementStatus());
    }
}
