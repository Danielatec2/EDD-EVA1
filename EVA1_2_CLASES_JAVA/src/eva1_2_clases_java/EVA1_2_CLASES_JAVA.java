/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author danii
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASE ES LA RECETA:
        //OBJETO ES EL PLATILLO
        //INSTANCIACIÓN: DAR MEMORIA
        //1. Declarar la identificador para el objeto
        //2. Asignar memoria con new
        //3.Invocar constructor
        // Persona()--> constructor;
        // constructor--> método
        Persona perso1= new Persona();
       // System.out.println(perso1);
       
       /* 
       ESTA SECCION ES PORQUE INICIAMOS CON LOS 
       ATRIBUTOS CON MODIFICADOR DEFAULT
       perso1.nombre="Daniela";
        perso1.apellido="Pinon";
        perso1.edad= 18;
        perso1.estadoCivil= false;//soltero //true es casadao
        System.out.println(perso1.nombre);
        System.out.println(perso1.apellido);
        System.out.println(perso1.estadoCivil);
*/
       perso1.setNombre("Daniela  ");
       perso1.setApellido("Pinon Polanco");
       perso1.setEdad(18);
       perso1.setEstadoCivil(false);
       /*System.out.println(perso1.getNombre());
       System.out.println(perso1.getApellido());
       System.out.println(perso1.getEdad());
       System.out.println(perso1.getEstadoCivil());*/
       perso1.imprimirDatos();
       // PERSONA 2
       Persona perso2= new Persona();
       perso2.setNombre("Vanessa");
       perso2.setApellido("Pinon Polanco");
       perso2.setEdad(15);
       perso2.setEstadoCivil(false);
       perso2.imprimirDatos();
       
       
       
       
               
       
       
      
       
      
        
        
       
       
       
       
        
       



        
        
            
        
    }
    
}
