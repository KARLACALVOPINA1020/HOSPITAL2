/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Patient {
    public String medicalRecord;
    public String[] personalData;
    public String healthStatus;
    public boolean hasInsurance;
    public String diagnosis;
    public boolean hasAllergies;

    public void showData() {
        System.out.println("Record: " + medicalRecord);
        System.out.println("Status: " + healthStatus);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

