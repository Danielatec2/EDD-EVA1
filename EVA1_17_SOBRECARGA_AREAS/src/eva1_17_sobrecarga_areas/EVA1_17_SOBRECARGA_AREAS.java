/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author danii
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AREA DE UN CIRCULO: "+area (5));
        System.out.println("AREA DE UN TRIANGULO: "+ area(10,5));
        System.out.println("AREA DE UN TRAPECIO: "+area (5,5,5));
    }
    public static double area(double radio){
       double pi=3.1416;
        return (pi*(radio*radio));
    }
    public static double area(double base, double altura){
        
        return ((base*altura)/2.0);
    }
    public static double area(double altura, double baseMayor, double basemenor){
       
        return altura*(baseMayor*basemenor)/2;
    }
    
}
