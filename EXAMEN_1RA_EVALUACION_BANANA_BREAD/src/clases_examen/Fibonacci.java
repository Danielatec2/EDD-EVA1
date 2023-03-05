/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author danii
 */
public class Fibonacci {
    private static int n;
    private static int a1;
    private static int a2;
    public Fibonacci(){
        int n=0;
        int a1=0;
        int a2=0;
    }
    public  Fibonacci(int numtotal, int val1in, int val2in){
        n=numtotal;
        a1=val1in;
        a2=val2in;
    }
    public static int CalcularSerie(){
        
        System.out.println( a1+"");
        for(int a= a1; a<=n; a++){
            System.out.println(a2+"");
            a2=a1+a2;
            a1=a2-a1;
        }
        return a2;
        
    }
    public int getN(){
        return n;
        
    }
    public int getA1(){
        return a1;
   
    }
    public int getA2(){
        return a2;
    }
    public void  setN(int valor){
       n=valor;
    }
    public void setA1(int valor){
        a1=valor;   
    }
    public void setA2(int valor){
        a2=valor;
    }
    public static void ImprimirlaSerie(){
        Fibonacci serie = new Fibonacci(6, 2,5 );
        System.out.println("FIBONACCI SERIE : ");
       CalcularSerie();
        
        
    }
    
    
    
    
    
    
    
    
}
