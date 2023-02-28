/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author danii
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //no se puede asinar otro vlalor a la constante en el final
        //final int x;
       // x=100;
       //x=200;
       FormulasGeometria  Formulas =new FormulasGeometria();
        System.out.println("MI PI"+ FormulasGeometria.Pi);
        System.out.println("AREA TRIANGULO"+ FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("VOLUMEN ESFERA"+FormulasGeometria.volumenEsfera(10));
    }
    
}
