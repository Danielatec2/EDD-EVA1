/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

/**
 *
 * @author DANIELA PIÑÓN POLANCO 225503043
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cali;
        cali=calif(85);// alamceno el resultado de una variable
        System.out.println("Calificacion : "+ cali);
        System.out.println("Calififcacion para 70: "+calif(70));// invovco desde otra función
        calif(100);//ingoro el resultado
    }
    public static String  calif(int cal){
        String resu = "";
        
                if((cal>=91) && (cal<=100)){
                // return "A";
                resu="A";
                }
                else if(cal>=81 && cal<=90){
                 //return "B";
                 resu="B";
                }
                else if(cal>=71 && cal<=80){
                  resu="C";
                 //return "C";
                }
                else {
                  //return "D"; 
                  resu="D";
                 
                }
                 return resu;
        
    } 
    
}
