/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {
    //Clase CuentaBancaria
    //String numero de cfuenta
    //String cliente
   
    public static void main(String[] args) {
      CuentaBancaria cuenta1= new CuentaBancaria("1",40000000,"Carlos Slim");
      
      //cuenta1.setNomCliente("Carlos slim");
      //cuenta1.setNumcuenta("1");
      //cuenta1.setSaldo(400000000);
        System.out.println("DATOS DEL CLIENTE:");
        String nombre=cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumnCuenta());
        System.out.println(cuenta1.getSaldo());
        CuentaBancaria cuenta2=new CuentaBancaria("2", 1000, "Ruben");
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumnCuenta());
        System.out.println(cuenta2.getSaldo());
        CuentaBancaria cuenta3= new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumnCuenta());
        System.out.println(cuenta3.getSaldo());   
        
      
      
      
    }
    
}
