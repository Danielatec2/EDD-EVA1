/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author danii
 */
public class CuentaBancaria {
    private static  String numCuenta;
    private static String nomCliente;
    private static double saldo;
    private static double deposito;
    private static double retiro;
   
 
    
    public CuentaBancaria(){
         numCuenta="";
         nomCliente="";
         saldo=0;
         deposito=0;
         retiro=0;
         
    }
    public CuentaBancaria(String nC, String nombC, double sald, double dep, double ret){
        numCuenta=nC;
        nomCliente=nombC;
        saldo=sald;
        deposito=dep;
        retiro=ret;
       
        
        
    }
    public static double  depositarEnCuenta(){
     double saldofinal=0;
      saldofinal = deposito+saldo;
      return saldofinal;
    
    }
    public static double retirarDeCuenta(){
      double saldofinal=depositarEnCuenta();
      double saldofinalretiro=0;
       if(saldofinal >= retiro){
         
         saldofinalretiro= (saldofinal-retiro);   
          
           
       }else if ( saldofinal<=retiro){
           System.out.println("SALDO INSUFICIENTE");
           
       }
       
return saldofinalretiro;
    }

     public String getNumCuenta(){
         return numCuenta;
     }
     public String getNomCliente(){
         return nomCliente;
     }
     public double getSaldo(){
         return saldo;
     }
     public void setNumCuenta( String valor){
         numCuenta=valor; 
     }
     public void setNomCliente(String valor){
         nomCliente=valor;
     }
     public void setSaldo(double valor){
         saldo=valor;
     }
     public  static void ImprimirDatos(){
         CuentaBancaria c1=new CuentaBancaria("1", "Daniela", 0, 400, 100);
         
         System.out.println("DATOS DEL CLIENTE");
         System.out.println("Numero de cuenta: "+c1.getNumCuenta());
         System.out.println("Nombre del cliente: "+c1.getNomCliente());
         System.out.println("Saldo: "+ c1.getSaldo());
         System.out.println("Deposito: "+deposito);
         System.out.println("Saldo final con deposito: "+depositarEnCuenta());
         System.out.println("Retiro: "+retiro);
         System.out.println("Saldo final con el retiro: "+retirarDeCuenta());
         System.out.println("");
         
              
        
         
     }
     

}
