/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author danii
 */
public class Auto {
    private String marca;
    private String modelo;
    private String placas;
    private int year;
    private String prop;
    private double adeudo;
    
    public Auto(){
        marca="";
        modelo="";
        placas="";
        year=0;
        prop="";
       
    }
    public Auto(String mar, String  mod, String pla, int y, String pro){
        marca=mar;
        modelo=mod;
        placas=pla;
        year=y;
        prop=pro;
       
    }
   public void calcularAdeudo(){
        if (year<=2000)
          adeudo=1500;
        else if (year>=2001 && year<=2005)
            adeudo=2000;
      else if (year>=2006 && year<= 2010)
         adeudo=2500;
      
      else if (year>=2011 && year <=2015){
         adeudo=3000;}
      else if (year>=2016 && year<=2023)
           adeudo=4000;
        else;
       
   }
          
   public String getMarca(){
       return marca;
   }
   public String getModelo(){
       return modelo;
   }
   public String getPlacas(){
       return placas;
   }
   public int getYear(){
       return year;
   }
   public String getProp(){
       return prop;
   }
   public void setMarca(String valor){
       marca=valor;
   }
   public void setModelo(String valor){
       modelo=valor;
   }
   public void setPlacas(String valor){
       placas=valor;
   }
   public void setYear(int valor){
       year=valor;
   }
   public void setProp(String valor){
       prop=valor;
   }
   public void ImprimirDatos(){
       System.out.println("DATOS ALMACENADOS :");
       System.out.println("Marca: "+marca);
       System.out.println("Modelo: "+modelo);
       System.out.println("Placas: "+placas);
       System.out.println("Year: "+year);
       System.out.println("Propietario: "+prop);
       System.out.println("Adeudo: "+adeudo);
   }
    
    
    
}
