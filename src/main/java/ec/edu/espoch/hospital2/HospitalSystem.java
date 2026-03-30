/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class HospitalSystem {
     public boolean validTransactions;

    public void registerPatient(String data) {
        System.out.println("Patient registered: " + data);
    }

    public void createAppointment(Doct d, Patient p, String time) {
        Appointment ap = new Appointment();
        ap.createAppointment(d, p, time);
    }

    public boolean verifyInsurance(Patient p) {
        return p.hasInsurance;
    }

    public void assignTreatment(Patient p, String medicine) {
        if (!p.hasAllergies) {
            System.out.println("System assigns: " + medicine);
        }
    }

    public void updateDiagnosis(Patient p, String result) {
        p.diagnosis = result;
        System.out.println("Updated diagnosis: " + result);
    }

    public void generateReport() {
        System.out.println("Generating report...");
    }
}
