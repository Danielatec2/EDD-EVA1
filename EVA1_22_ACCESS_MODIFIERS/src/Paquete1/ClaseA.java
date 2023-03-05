/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author DANIELA PIÑON POLANCO
 */
public class ClaseA {
   public  int publicA;
   int defaultA;
   private int  privateA;
  public void prueba(){
      ClaseB  objB= new ClaseB();
      //objB.publicB; atributos visbiles 
      //objB.defaultB;
      
      ClaseC objC= new ClaseC();
      //objC.publicC ;tambien son visibles
      //objC.defaultC;
      //clase D es default en otro archivo pero en el mismo paquete
      ClaseD objD= new ClaseD();
     // objD.publicD; ATRIBUTOS VISIBLES
      //objD.defaultD;
      //CLASE E
      // Hay que agregar la clausula IMPORT
      ClaseE objE= new ClaseE();
      //objE.publicE; Solo el atributo publico 
      //CLASE F ES DEFAULT Y ES INVISIBLE PARA LAS CLASES DE ESTE PQUETE1
      //ClaseF objF= new ClaseF(); 
     
      
      
              
  }
 
  
}
class ClaseB{
    public  int publicB;
   int defaultB;
   private int  privateB;
           
    
}
