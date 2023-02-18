
package eva1_6_automovil;

/**
 *
 * @author danii
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Auto auto1=new Auto();
      auto1.setMarca("Ford");
      auto1.setModelo( "Fiesta");
      auto1.setPlacas("3kh23");
      auto1.setProp("daniela");
      auto1.setYear(2004);
      auto1.calcularAdeudo();
      auto1.ImprimirDatos();
      Auto auto2= new Auto("Chevrolet", "grand sport", "32jvk", 2023, "Vanessa");
      auto2.calcularAdeudo();
      auto2.ImprimirDatos();
    }
    
      
      
      
      
      
     
      
      
      
       
       
        

    
    
}
