/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Doct {
   public String doctorName;
   public boolean available;

    public void assignTreatment(Patient p, String medicine) {
        if (available && !p.hasAllergies) {
            System.out.println("Treatment assigned: " + medicine);
        } else {
            System.out.println("Cannot assign treatment.");
        }
    }
}
