/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author danii
 */
public class CuentaBancaria {
    //Atributos clase
private String numCuenta;
private double  saldo;
private String nomCliente;
//constructores
//default y con atributos 
public CuentaBancaria(){//Constructor default
    numCuenta="";
    saldo=0;
    nomCliente="";
      
}
public CuentaBancaria(String nCuenta, double oSaldo, String nCliente){
   numCuenta=nCuenta;
   saldo=oSaldo;
   nomCliente=nCliente;
}


//Comportamiento
//Metosoa get y set
public String getNumnCuenta(){
    return numCuenta;
}
public double getSaldo (){
     return saldo;
}
public  String getNomCliente(){
    return nomCliente;
}
public void setNumcuenta(String valor){
    numCuenta=valor;
}
public void setSaldo(double valor){
    saldo=valor;
}
public void setNomCliente(String valor){
    nomCliente=valor;
}




}
