/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_sobrecarga_2;

/**
 *
 * @author danii
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SUMA: "+ suma(4,5));
        System.out.println("SUMA: "+suma(4.0,5.0));
        System.out.println("SUMA: "+ suma("hola ", "mundo!!!!"));
        suma();
    }                 //suma(int,int) FIRMA 
    public static int suma( int val1, int val2){
       return val1+val2; 
        
    }                    //suma(double, double) firma
    public static double suma( double val1, double val2){
       return val1+val2; 
        
    }                      //suma(String, String) FIRMA
     public static String suma( String val1, String val2){
       return val1+val2; 
        
    }                      // suma() FIRMA
      public static void suma( ){
          System.out.println("METODO SIN PARAMETROS SUMA");
        
    }
    

}
