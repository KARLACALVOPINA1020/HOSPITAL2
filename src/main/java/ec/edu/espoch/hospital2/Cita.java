/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Cita {
    public String horario;
    public Paciente paciente;
    public Doctor doctor; // Verifica si tu clase se llama Doctor o Medico

    // Este es el constructor que pide el String, el Paciente y el Doctor
    public Cita(String horario, Paciente paciente, Doctor doctor) {
        this.horario = horario;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public void verificarYConfirmar() {
        // Aquí va tu lógica de seguro y disponibilidad
        if (doctor.estaDisponible && paciente.tieneSeguroActivo) {
            System.out.println("Cita confirmada");
        } else {
            System.out.println("No se pudo confirmar");
        }
    }
}
