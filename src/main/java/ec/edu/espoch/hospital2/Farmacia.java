/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Farmacia {
    public int stockMedicamento;

    public void entregarMedicamento(String medicamento, boolean recetaValida) {
        if (recetaValida && stockMedicamento > 0) {
            stockMedicamento--;
            System.out.println("Medicamento entregado. Stock restante: " + stockMedicamento);
        } else {
            System.out.println("No se puede entregar el medicamento.");
        }
    }
}
