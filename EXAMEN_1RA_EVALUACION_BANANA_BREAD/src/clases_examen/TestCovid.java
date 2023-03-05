/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author danii
 */

public class TestCovid {
 private static int edad;
 private static boolean Ecronica;
 private static double peso; // El peso es en kilogramos
 private static double estatura; // La estatura es en metros

 
 public TestCovid(){
     edad = 0;
     Ecronica = false; 
     peso = 0;
     estatura = 0;
   }
 
 public  TestCovid(int edadTest, boolean EcronicaTest,double pesoTest,double estaturaTest){
     edad = edadTest;
     Ecronica= EcronicaTest;
     peso = pesoTest;
     estatura = estaturaTest;    
    }
  
 private static double calcularIMC(){
    double IMC;
     return peso / (estatura*estatura);
 }

 public static void calcularPersonaRiesgo(){
     
     double imc = calcularIMC();
         if ((edad >= 65) || (Ecronica == true) ||  (imc > 30)){
        System.out.println("PERSONA DE RIESGO");
    }
    else{  
        System.out.println("PERSONA SIN RIESGO");
    }

 }
 
 public int getEdad(){
     return edad;
 }
 public boolean getEcronica(){
     return Ecronica;
 }
 public double getPeso(){
     return peso; 
 }
 public double getEstatura(){
     return estatura;
 }
 public void setEdad(int valor){
     edad = valor;
 }
 public void setEcronica(boolean valor){
     Ecronica = valor;
 }
 public void setPeso(double valor){
     peso = valor;
 }
 public void setEstatura(double valor){
     estatura = valor;
 }
 public static void imprimirDatos(){
     TestCovid MiTest = new TestCovid (25, false, 70.5, 1.80);
     
     double imc = calcularIMC();
     System.out.println("\nDATOS TEST");
     System.out.println("ESTATURA: " + estatura);
     System.out.println("EDAD: " + edad);
     System.out.print("PADECE DE ENFERMEDAD CRONICA: " + Ecronica);
     System.out.println();
     System.out.println("PESO: " + peso);
      System.out.println("IMC: " +imc);
     calcularPersonaRiesgo();
     System.out.println("");
    
          
 }

 
}
