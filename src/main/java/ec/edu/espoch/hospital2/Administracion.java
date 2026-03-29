/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Administracion {
     public void generarReporte(boolean transaccionesGuardadas) {
        if (transaccionesGuardadas) {
            System.out.println("Generando reporte diario de citas, pruebas y tratamientos...");
        } else {
            System.out.println("Error: No se han guardado todas las transacciones.");
        }
    }
}
