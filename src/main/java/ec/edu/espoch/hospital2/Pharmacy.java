/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Pharmacy {
     public int medicineStock;

    public void deliverMedicine(boolean validPrescription) {
        if (validPrescription && medicineStock > 0) {
            medicineStock--;
            System.out.println("Medicine delivered.");
        } else {
            System.out.println("Cannot deliver medicine.");
        }
    }

    public void updateQuantity(int amount) {
        medicineStock += amount;
        System.out.println("Stock updated: " + medicineStock);
    }
}
