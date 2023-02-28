/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static;

/**
 *
 * @author danii
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //STATIC algo que podemos usar sin crear instancias de una clase,
        // SOLO SE CREA UNA instancia de los estatico
        System.out.println("PI"+ Math.PI);
        System.out.println("numero alteatorio"+ Math.random());
        Utilerias utileria= new Utilerias();
        utileria.Sludo();
        Utilerias.otroSaludo();
        Saludo2();//NO ES ESTATICO , Y NO SE HA CREADO UN OBEJTO , EL METODO NO EXISTE 
       
    }
    public void Sauludo2(){
        System.out.println("HOLAA");
    }
}
class Utilerias{
    //ESTE METODO EXISTE HASTA QUE SE SE CREA UN OBJETO DE LA CLASE 
    // CLASE. SOLO SE SUSA A TRAVES DE UN OBJETO
    public void Sludo(){
        System.out.println("Hola!!");
           
    }
    // otroSauldo(); ESTE METODO EXISTE EN EL  MOMENTO QUE PROGRAMA 
    // INICIA SU EJECUCION . NO NECESITA QUE CREE UN OBJETO DE LA CLASE
    // CLASE PARA UTIILIZAR , SE USA A TRAVES DE LA CLASE 
    public static void otroSaludo(){
        System.out.println("Otro saludo (static)");
    }
    
}
class OtraClase{
    
}
