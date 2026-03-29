/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.hospital2;

public class Paciente {
    public String nombre;
    public String id;
    public String expediente;
    public String alergias;
    public boolean tieneSeguroActivo;

    public void registrar(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        System.out.println("Paciente registrado: " + nombre);
    }
}
