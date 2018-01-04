/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validar;

/**
 *
 * @author Bea
 */
public class Validar {
    private String abecedario="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numeros="1234567890";
    private char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    char[] nies={'X','Y','Z'};
    private String nieses="XYZ";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validar v= new Validar();
        String[] prueba={"X9098510D","02753456B","9878","988776654","9284387987464638879"};//en string los nif a probar
        for(int i=0; i<=(prueba.length-1);i++){
            boolean meter= v.introducir_nif(prueba[i]);
            System.out.println("El dni: "+prueba[i]+" se puede meter "+ meter);
        }
        
    }
   // public boolean validar_nif(){} // meter el codigo del otro ordena
    public  boolean valiadar_dni(String dni){
    /*permite validar que se un dni*/
        boolean flag= false;
        if(dni.length()==9){// si el tamaño es adecuado
            if(abecedario.contains(dni.substring(8))){//compara si la ultima es una letra
                try{
                    int aux=Integer.parseInt(dni.substring(0, 8));//se trata de castear si no se puede no es válido.
                    if(dni.charAt(8)==(letras[aux%23])){// si el algoritmo de comprobacion da la letra del dni es valido
                        flag=true;
                    }
                    
                }catch(Exception e){}//no hace nada ya que devolveria el false que ya guarda el flag
            }
        }
        return flag;
    }
    public boolean validar_nie(String nie){
        /*permite validar que se un nie*/
        boolean flag=false;
        if(nie.length()==9){//si tiene la longitud adecuada
            if(nieses.contains(nie.substring(0, 1))){//si la primera letra es valida
                if(nie.charAt(0)== nies[0]){
                    nie=0+nie.substring(1);                                       
                }
                if(nie.charAt(1)== nies[1]){
                    nie=1+nie.substring(1); 
                }
                if(nie.charAt(2)== nies[2]){
                    nie=2+nie.substring(1); 
                }
                flag= this.valiadar_dni(nie);
                }
            }
            
        
        return flag;
    }
    public boolean nie_noenbase(String n){
    /*hasta la realizacion del trigger esto se quedara asi*/
        return true;
    }
    public boolean dni_noenbase(String d){
    /* hasta que se realice el trigger se queda a true*/
        return true;
    }
    public boolean introducir_nif(String nif){
        /*aprueba o deniega el acceso al dni nuevo como nueva entrada en la base*/
        boolean flag= false;
        if(valiadar_dni(nif)){//si es un dni
            if(dni_noenbase(nif)){//y no esta en base
                flag=true;
            }
        }
        if(validar_nie(nif)){//si es un nie
            if(nie_noenbase(nif)){//y no esta en base
                flag=true;
            }
        }
        return flag;
    }
    public boolean validar_creditos(int n){
        boolean flag=false;//salvo que se valide
        if(n>0){//comprobamos que los creditos sean un número positivo
            if((n==240)||(n==360)){//hemos acordado que solo seran estos posibles valores
                flag=true;//en caso de que esté entre los valores
            }
        }
        return flag;
    }
    public boolean validar_tipos_creditos(int cred, int opta, int tran, int obl){
        boolean flag= false;
        if((cred==240)||(cred==360)){
            if((opta==80)&&(tran==12)&&(obl==148)){//si cumple con los parametros
                flag=true;
            }
            if((opta==80)&&(tran==24)&&(obl==256)){//si cumple con los parametros
                flag=true;
            }
        }
        return flag;
    }
}
