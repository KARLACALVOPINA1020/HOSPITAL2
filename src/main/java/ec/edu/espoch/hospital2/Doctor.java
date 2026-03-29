/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Doctor {
    public String nombre;
    public boolean estaDisponible;

    public void asignarTratamiento(Paciente paciente, String medicamento, String diagnostico) {
        if (diagnostico != null && !paciente.alergias.contains(medicamento)) {
            System.out.println("Tratamiento asignado: " + medicamento);
        } else {
            System.out.println("No se puede asignar el tratamiento por alergias o falta de diagnóstico.");
        }
    }
    
}
