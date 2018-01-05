/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapruebamatriculacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import javax.json.*;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

/**
 *
 * @author febis
 */
public class ProgramaPruebaMatriculacion {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int operacion;
        imprimir_menu();
        
        operacion=Integer.parseInt(entrada.readLine());
        while(operacion!=-1){
            switch(operacion){
                case 1: microservicio1(); break;
                case 2: microservicio2(); break;
                //case 3: microservicio3(); break;
                //case 4: microservicio4(); break;
                default: System.out.println("Introduzca un numero correcto."); break;
        
        
        
            }
            imprimir_menu();
            operacion=Integer.parseInt(entrada.readLine());
            
        }
        
    }
    
    private static void imprimir_menu(){
        System.out.println("\nIntroduzca el numero del microservicio que quiere probar (-1 para salir): ");
        System.out.println("1. Obtener Asignaturas matriculables para el alumno");
        System.out.println("2. Ver expediente alumno");
        //System.out.println("3. Eliminar alumno");
        //System.out.println("4. Actualizar informacion nuevo alumno");
        System.out.print("\nOpcion: ");
    }
    
    private static void microservicio1() throws IOException{
        try{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nIntroduzca expediente del Alumno que se quiere matricular: ");
        String expediente = entrada.readLine();
        
        String URL = "http://localhost:9200/asignaturasMatriculablesByAlumno/"+expediente;
        HttpGet request = new HttpGet(URL);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response;
        response = client.execute(request);
        System.out.println("Response: " + response.getStatusLine());
        if(response.getStatusLine().getStatusCode()==200){
            InputStream is = response.getEntity().getContent();
            JsonReader rdr = Json.createReader(is);
            JsonArray asignaturas = rdr.readArray();
            for(int i=0;i<asignaturas.size();i++){
                JsonObject aux = asignaturas.getJsonObject(i);
                System.out.println(aux.toString());
                aux=null;
            }
            JsonArray asignaturas_matriculadas = (JsonArray) Json.createArrayBuilder().add(asignaturas.getJsonObject(0))
                                                                                       .add(asignaturas.getJsonObject(1))
                                                                                        .build();
            
            URL = "http://localhost:9200/crearMatricula/"+expediente;
            HttpPost post = new HttpPost(URL);
            DefaultHttpClient client2 = new DefaultHttpClient();

            post.setHeader("Accept", "application/json");
            post.setHeader("headerValue", "HeaderInformation");
            //setting json object to post request.
            StringEntity entity = new StringEntity(asignaturas_matriculadas.toString(), "UTF8");
            entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
            post.setEntity(entity);
            response=client2.execute(post);
            System.out.println("Response: " + response.getStatusLine());
            
     
        }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    
    }
    
    private static void microservicio2() throws IOException{
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca expediente del Alumno que se quiere consultar: ");
            String expediente = entrada.readLine();
            
            String URL = "http://localhost:9200/verExpediente/"+expediente;
            HttpGet request = new HttpGet(URL);
            DefaultHttpClient client = new DefaultHttpClient();
            HttpResponse response;
            response = client.execute(request);
            System.out.println("Response: " + response.getStatusLine());
            if(response.getStatusLine().getStatusCode()==200){
            InputStream is = response.getEntity().getContent();
            JsonReader rdr = Json.createReader(is);
            JsonArray asignaturas = rdr.readArray();
            for(int i=0;i<asignaturas.size();i++){
                JsonObject aux = asignaturas.getJsonObject(i);
                System.out.println(aux.toString());
                aux=null;
            }
            
            
        }}
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
    

