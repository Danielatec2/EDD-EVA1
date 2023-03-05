/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;



/**
 *
 * @author danii
 */
public class DatosIntegrantes {
 private static String inte1="22550343, ISC, DANIELA PINON POLANCO ";
   private static String inte2="22550326, ISC, POLETH ELIZAMA ESCARCEGA LOPEZ";
   private static String inte3="22550373, ISC, ALLISON MICHELLE ALDAZ MARTINEZ";
   private static  String inte4="22550377, ISC, ANGEL ROBERTO MARTINEZ MONTEZ  ";
   private static String nomequipo="BANANA BREAD";
  
    public static void  imprimirDatos(){
   System.out.println("DATOS DE INTEGRANTES  ");
   System.out.println("INTEGRANTE 1: "+ inte1);
   System.out.println("INTEGRANTE 2: "+inte2);
   System.out.println("INTEGRANTE 3: "+inte3);
   System.out.println("INTEGRANTE 4:  "+inte4);
   System.out.println("NOMBRE DEL EQUIPO: "+nomequipo);
   System.out.println("");
   
    }
    public static  void ImprimirProblemasResueltos(){
        DatosIntegrantes.imprimirDatos();
       TestCovid.imprimirDatos();
       CuentaBancaria.ImprimirDatos();
       Fibonacci.ImprimirlaSerie();
       
        
        
        
    }
    
}
