
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author laura
 */
public class Registro {

    public static List<Estudiante> estudiantes = new ArrayList<>(); 
    
    public static void main(String[] args) {
       procesarComandos();
    }
    public static void procesarComandos(){
        byte opcion =1;
        Scanner sc = new Scanner(System.in);
        while (opcion ==1 || opcion ==2){
            String comandos = sc.nextLine();
            opcion = Byte.parseByte(comandos.substring(0,1));
            
            switch (opcion) {
                case 1:
                    agregarEstudiante(comandos);
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                    
            }
        }
    
    }
    public static void  agregarEstudiante (String comandos){
        String [] arrayComandos = comandos.split("&");
        String nivel = arrayComandos [1];
        String nombre = arrayComandos [2];
        int edad = Integer.parseInt(arrayComandos[3]);
        String programa = arrayComandos[4];
        String etnia = arrayComandos[5];      
        
        if (nivel.equals("Pregrado")){
        int creditos = Integer.parseInt(arrayComandos[6]);
        Pregrado nuevoEsPre = new Pregrado (nombre, programa, etnia, edad, creditos);
        estudiantes.add(nuevoEsPre);
        }else{
            String modalidad = arrayComandos[6];
            Posgrado nuevoEsPos = new Posgrado(nombre, programa, etnia, edad, modalidad);
            estudiantes.add(nuevoEsPos);
        
        }
    }
    public static void listarEstudiantes(){
        System.out.print("***Listado de estudiantes***");
        for (Estudiante i: estudiantes){
            System.out.print(i);
        }
        System.out.print("\n"); 
    }
}
