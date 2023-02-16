/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_circulo;

/**
 *
 * @author danii
 */
public class Circulo {
    //ATRIBUTOS CLASE
    private double radio;
    private double pi;
    private double perimetro;
    private double area;
    //CONSTRUCTORES
    public Circulo(){
        radio=8;
        pi=3.1416;
        perimetro=0;
        area=0;
    }
    //COMPORTAMIENTO
   // public void calcularArea(){
        //area=(pi*(radio*radio));
       // System.out.println("EL AREA ES: "+area);
    //}
   // public void calcularPerimetro(){
     //   perimetro=(pi*(radio+radio));
      //  System.out.println("EL PERIMETRO ES: "+perimetro);
    //}
    
    
    //METODO SET GET

    public double getArea() {
        return
        area=(pi*(radio*radio));
        
    }

    public double getPerimetro() {
        return perimetro=(pi*(radio+radio));
    }
    public double setArea(double valor){
        area=valor;
        return 0;
    }
    public double setPerimetro(double valor){
        perimetro=valor;
        return 0;
    }
    
    

    

    
            
    
    
    
    
}
