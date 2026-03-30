/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Appointment {
    public Doct doctor;
    public Patient patient;
    public String time;

    public void createAppointment(Doct d, Patient p, String t) {
        doctor = d;
        patient = p;
        time = t;

        System.out.println("Appointment created with Dr. " + d.doctorName + " at " + t);
    }
}