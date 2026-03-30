/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Hospital2 {
  public static void main(String[] args){
  
        Patient p = new Patient();
        p.medicalRecord = "206";
        p.healthStatus = "Stable";
        p.hasInsurance = true;
        p.hasAllergies = false;
        
        Doct d = new Doct();
        d.doctorName = "Karla Calvopiña";
        d.available = true;
        System.out.println("...........................................................");
        Pharmacy ph = new Pharmacy();
        ph.medicineStock = 10;
        System.out.println("...........................................................");
        Laboratory lab = new Laboratory();
        lab.equipmentAvailable = true;

        HospitalSystem system = new HospitalSystem();
        System.out.println("...........................................................");
        system.registerPatient("Patient 206");
        system.createAppointment(d, p, "14:00 PM");
        System.out.println("...........................................................");
        d.assignTreatment(p, "Paracetamol");
        System.out.println("...........................................................");
        ph.deliverMedicine(true);
        lab.processTest(true);
        System.out.println("...........................................................");
        lab.uploadResult(system);
        system.updateDiagnosis(p, "Flu");
        system.generateReport();
    }
}
