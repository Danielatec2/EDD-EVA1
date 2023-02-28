/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author danii
 */
public class FormulasGeometria {
    
    //final SIGNIFICADO PARA CLASE
    //SINIFICADO PARA VARIABLES: SOLO SE PUEDEN ASIGNAR SOLO UN VEZ VALOR A LA VARIANLE
    public static final double Pi=3.14159;
    //area
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2.0;
    }
    
   
    public static double areaCirculo(double radio){
        return Pi*radio*radio;
    }
    public static double  perimetroCirculo(double radio){
        return Pi*(radio*2);
    }
    
    //volumen
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*Pi*(radio*radio*radio);
    }
    
}
