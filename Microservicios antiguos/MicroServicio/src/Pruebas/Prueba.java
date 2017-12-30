/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Alumnos.Actualizar_Alumno_By_NIF;
import Alumnos.Alta_Alumno;
import Alumnos.Eliminar_Alumno_By_NIF;
import Alumnos.Obtener_Alumnos_By_NIF;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.json.*;

/**
 *
 * @author febis
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int operacion;
        imprimir_menu();
        
        operacion=Integer.parseInt(entrada.readLine());
        while(operacion!=-1){
            switch(operacion){
                case 1: microservicio1(); break;
                case 2: microservicio2(); break;
                case 3: microservicio3(); break;
                case 4: microservicio4(); break;
                default: System.out.println("Introduzca un numero correcto."); break;
        
        
        
            }
            imprimir_menu();
            operacion=Integer.parseInt(entrada.readLine());
            
        }
        
    }
    
    private static void imprimir_menu(){
        System.out.println("\nIntroduzca el numero del microservicio que quiere probar (-1 para salir): ");
        System.out.println("1. Obtener JSON Alumno por DNI");
        System.out.println("2. Insertar nuevo alumno");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Actualizar informacion nuevo alumno");
        System.out.print("\nOpcion: ");
    }
    
    private static void microservicio1() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nIntroduzca DNI del Alumno que se quiere recuperar: ");
        String DNI = entrada.readLine();
        
        Obtener_Alumnos_By_NIF micro1 = new Obtener_Alumnos_By_NIF();
        JsonObject obj = micro1.ejecutar(DNI);
        if(obj!=null)System.out.println(obj.toString());
    
    }
    
    private static void microservicio2() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        JsonObject obj;
        System.out.print("\nIntroduzca DNI del nuevo alumno: ");
        String dni = entrada.readLine();
        System.out.print("\nIntroduzca contrasenna del nuevo alumno: ");
        String contrasenna = entrada.readLine();
        System.out.print("\nIntroduzca nombre del nuevo alumno: ");
        String nombre = entrada.readLine();
        System.out.print("\nIntroduzca apellido 1 del nuevo alumno: ");
        String apellido1 = entrada.readLine();
        System.out.print("\nIntroduzca apellido 2 del nuevo alumno: ");
        String apellido2 = entrada.readLine();
        System.out.print("\nIntroduzca fecha del nuevo alumno: ");
        String fecha = entrada.readLine();
        System.out.print("\nIntroduzca email del nuevo alumno: ");
        String email = entrada.readLine();
        System.out.print("\nIntroduzca cuenta corriente del nuevo alumno: ");
        int cc = Integer.parseInt(entrada.readLine());
        System.out.print("\nIntroduzca carrera del nuevo alumno: ");
        long carrera = Integer.parseInt(entrada.readLine());
        
        obj = Json.createObjectBuilder()
                            .add("NIF", dni)
                            .add("Nombre", nombre)
                            .add("Apellido1", apellido1)
                            .add("Apellido2", apellido2)
                            .add("FechaNacimiento", fecha)
                            .add("Email", email)
                            .add("CuentaCorriente", cc)
                            .add("Carrera", carrera)
                            .add("Contrasenna", contrasenna)
                            .build();
            
        Alta_Alumno micro2 = new Alta_Alumno();
        micro2.ejecutar(obj);
    }
    
    private static void microservicio3() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nIntroduzca DNI del alumno a eliminar: ");
        String NIF = entrada.readLine();
        
        Eliminar_Alumno_By_NIF micro3 = new Eliminar_Alumno_By_NIF();
        micro3.ejecutar(NIF);
    }
    
    private static void microservicio4() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        JsonObject obj;
        System.out.print("\nIntroduzca el DNI del alumno que se quiere actualizar: ");
        String NIF = entrada.readLine();
        System.out.print("\nIntroduzca nuevo DNI del nuevo alumno: ");
        String dni = entrada.readLine();
        System.out.print("\nIntroduzca nuevo contrasenna del nuevo alumno: ");
        String contrasenna = entrada.readLine();
        System.out.print("\nIntroduzca nuevo nombre del nuevo alumno: ");
        String nombre = entrada.readLine();
        System.out.print("\nIntroduzca nuevo apellido 1 del nuevo alumno: ");
        String apellido1 = entrada.readLine();
        System.out.print("\nIntroduzca nuevo apellido 2 del nuevo alumno: ");
        String apellido2 = entrada.readLine();
        System.out.print("\nIntroduzca nuevo fecha del nuevo alumno: ");
        String fecha = entrada.readLine();
        System.out.print("\nIntroduzca nuevo email del nuevo alumno: ");
        String email = entrada.readLine();
        System.out.print("\nIntroduzca nuevo cuenta corriente del nuevo alumno: ");
        int cc = Integer.parseInt(entrada.readLine());
        System.out.print("\nIntroduzca nuevo carrera del nuevo alumno: ");
        long carrera = Integer.parseInt(entrada.readLine());
        
        obj = Json.createObjectBuilder()
                            .add("NIF", dni)
                            .add("Nombre", nombre)
                            .add("Apellido1", apellido1)
                            .add("Apellido2", apellido2)
                            .add("FechaNacimiento", fecha)
                            .add("Email", email)
                            .add("CuentaCorriente", cc)
                            .add("Carrera", carrera)
                            .add("Contrasenna", contrasenna)
                            .build();
        
        Actualizar_Alumno_By_NIF micro4 = new Actualizar_Alumno_By_NIF();
        micro4.ejecutar(NIF, obj);
        
    }
    
        
    
}
