/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaprueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.json.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;


/**
 *
 * @author febis
 */
public class ProgramaPrueba {

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
                //case 4: microservicio4(); break;
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
        try{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nIntroduzca DNI del Alumno que se quiere recuperar: ");
        String DNI = entrada.readLine();
        
        String URL = "http://localhost:9100/alumnoByNIF/"+DNI;
        HttpGet request = new HttpGet(URL);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response;
        response = client.execute(request);
        System.out.println("Response: " + response.getStatusLine());
        if(response.getStatusLine().getStatusCode()==200){
            InputStream is = response.getEntity().getContent();
            JsonReader rdr = Json.createReader(is); //Leer el objeto JSON
            JsonObject obj = rdr.readObject(); //Sacar el objeto JSON leido
            System.out.println(obj.toString());
            rdr.close();
            is.close();
        
        }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    
    }
    
    private static void microservicio2() throws IOException{
        try{
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
            
        
        
            String URL = "http://localhost:9100/alta_alumno";
            HttpPost post = new HttpPost(URL);
            DefaultHttpClient client = new DefaultHttpClient();

            post.setHeader("Accept", "application/json");
            post.setHeader("headerValue", "HeaderInformation");
            //setting json object to post request.
            StringEntity entity = new StringEntity(obj.toString(), "UTF8");
            entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            System.out.println("Response: " + response.getStatusLine());
            
            
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            
        }
    }
    
    private static void microservicio3() throws IOException{
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nIntroduzca DNI del alumno a eliminar: ");
            String DNI = entrada.readLine();
        
            String URL = "http://localhost:9100/alumnoByNIF/"+DNI;
            HttpDelete request = new HttpDelete(URL);
            DefaultHttpClient client = new DefaultHttpClient();
            HttpResponse response;
            response = client.execute(request);
            System.out.println("Response: " + response.getStatusLine());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
