/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Laboratory {
     public boolean equipmentAvailable;

    public void processTest(boolean correctSample) {
        if (correctSample && equipmentAvailable) {
            System.out.println("Test processed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    public void uploadResult(HospitalSystem s) {
        System.out.println("Results uploaded to system.");
    }
}
