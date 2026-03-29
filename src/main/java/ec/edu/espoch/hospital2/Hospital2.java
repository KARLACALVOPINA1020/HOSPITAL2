/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.hospital2;

public class Hospital2 {

    public static void main(String[] args) {
       // 1. Creamos los objetos iniciales
        Paciente nuevoPaciente = new Paciente();
        nuevoPaciente.registrar("Karla Calvopiña", "17263544");
        nuevoPaciente.alergias = "Penicilina"; // Ejemplo de alergia
        nuevoPaciente.tieneSeguroActivo = true;

        Doctor doctor = new Doctor();
        doctor.nombre = "Dr. García";
        doctor.estaDisponible = true;

        // 2. Proceso de Cita
        System.out.println("Proceso de Cita");
        // Le pasamos: "Hora", el objeto paciente y el objeto doctor
        Cita citaHoy = new Cita("10:30 AM", nuevoPaciente, doctor); 
        citaHoy.verificarYConfirmar();

        // 3. Consulta y Laboratorio
        System.out.println("Proceso de Laboratorio");
        Laboratorio lab = new Laboratorio();
        lab.equipoDisponible = true;
        // Simulamos que la muestra se tomó bien (true)
        lab.procesarPrueba("Sangre", true);

        // 4. Asignación de Tratamiento
        System.out.println("Diagnóstico y Tratamiento");
        // El doctor intenta dar un medicamento al que el paciente es alérgico
        doctor.asignarTratamiento(nuevoPaciente, "Penicilina", "Infección");
        // El doctor intenta con otro medicamento seguro
        doctor.asignarTratamiento(nuevoPaciente, "Ibuprofeno", "Infección");

        // 5. Farmacia
        System.out.println("Entrega en Farmacia");
        Farmacia farma = new Farmacia();
        farma.stockMedicamento = 10;
        farma.entregarMedicamento("Ibuprofeno", true);

        // 6. Cierre del día
        System.out.println("Reporte Administrativo");
        Administracion admin = new Administracion();
        admin.generarReporte(true); // Suponemos que todo se guardó bien
    }
}
