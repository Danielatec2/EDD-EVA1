/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga_rfc;

/**
 *
 * @author danii
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc= generarRFC ("DANIELA","PINNON","POLANCO",2004,05,14);
        System.out.println(rfc);
    }
    public static String generarRFC (String nombre, String apPat,String apMat , int annio, int mes, int dia){
       String ap= apPat.charAt(0)+"";
       String ap2= apPat.charAt(1)+"";
       String apM= apMat.charAt(0)+"";
       String nom= nombre.charAt(0)+"";
       String rfc= ap+ap2+apM+nom+annio+mes+dia+"";
       return rfc;
    
    }
    
    
}
