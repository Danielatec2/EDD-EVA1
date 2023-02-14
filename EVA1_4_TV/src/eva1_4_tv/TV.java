/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author danii
 */
public class TV {
    private int volum;
    private int canal;
    private boolean poder;
    // constructores
    public TV(){//constructor default
        volum=0;
        canal=0;
        poder=false;//apagado
    }
    
    // metodos para operar la tv (interfaz)
    //encender y apgar tv
    public void cambiarEstadoPoder(){
        if(poder==true){
            poder=false;
            System.out.println("Apagando pantalla");
        }else {
            poder=true;
            System.out.println("Encendiendo pantalla");
        }
    }
   // volumen
    public void subuirVoleumen(){
        if(poder==true){//la tv esta prendida if (poder)
            if(volum <100){
        volum++; //volumen=columen+1, volumen+=1
        System.out.println("volumen"+volum);}
        }
    }
    public void bajarVolumen(){
        if (poder==true){
            if(volum>0){
        volum--;
        System.out.println("volumen"+volum);}
        }
    }
    public void subirCanal(){
        if (poder==true){
             canal++;
            if(canal>100){
               canal=0;
                System.out.println("canal:"+canal);
            }
        }
    }
    public void bajarCanal(){
        if (poder==true){
             canal--;
            if(canal<0){
                canal=100;
                System.out.println("canal:"+canal);
            }
        }
    }
   
}
