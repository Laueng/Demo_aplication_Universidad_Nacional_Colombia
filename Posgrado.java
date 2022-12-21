/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class Posgrado extends Estudiante {
    private String modalidad;

    public Posgrado(String nombre, String programa, String tipo_etnia, int edad, String modalidad) {
        super(nombre, programa, tipo_etnia, edad);
        this.modalidad = modalidad;
    }

    @Override
    public String toString(){
   return  "\n\tEstudiante Posgrado"+ super.toString() +"\n\tModalidad: "+ modalidad;
}
}