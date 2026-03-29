/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Laboratorio {
    public boolean equipoDisponible;

    public void procesarPrueba(String tipoPrueba, boolean muestraRecolectada) {
        if (muestraRecolectada && equipoDisponible) {
            System.out.println("Prueba de " + tipoPrueba + " procesada exitosamente.");
        } else {
            System.out.println("Error: Muestra no recolectada o equipo no disponible.");
        }
    }
}
