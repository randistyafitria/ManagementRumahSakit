package controller;

import model.Appointment;
import utils.Global;

public class AppointmentController {
    public static void checkAgreement(Appointment ap) {
        if (ap.getDoctorAgreement() && ap.getPatientAgreement()) {
            Global.activeAppointmentList.add(ap);
            Global.pendingAppointmentList.remove(ap);
        } else {
            Global.activeAppointmentList.remove(ap);
            Global.pendingAppointmentList.add(ap);
        }
    }

    public static void cancelAppointment(Appointment ap) {
        Global.activeAppointmentList.remove(ap);
    }
}