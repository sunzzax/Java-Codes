package com.mycompany.clasificacion_de_numeros;
import java.util.Scanner;

public class Clasificacion_De_Numeros {

public static void main(String[] args) {
   
    
    //Contadores
    int cantPositivos = 0;
    int cantNegativos = 0;
    int cantCeros= 0;
    
     
    
    //Acumuladores
    int sumPositivos = 0;
    int sumNegativos = 0;
    int sumaTotal = 0;
    
    
    //Otras variables
    int contador;
    int numero;
    int numerosTotales = 0;
    int numeros = 10;
    
    
    double mediaPositivos = 0;
    double mediaNegativos = 0;
    double mediaTotal = 0;
    
     
    
    for (contador = 1; contador <= numeros; contador++){
        Scanner scan= new Scanner(System.in);
        System.out.println("Numero " + contador + ":");
        numero = scan.nextInt();
        
        sumaTotal +=numero;
        
        /*Aqui lo que indicamos es que cuando el numero que se haya introducido sea MENOR que 0 añada
        en 1  la cantidad de numeros NEGATIVOS  y tambien le asignamos el numero que haya salido a 'sumNegativos'*/
        
        if (numero < 0){
        cantNegativos++;
        //Sumamos el numero a sumNegativos
        sumNegativos +=numero;
        }else {
            
       if  (numero > 0){
       cantPositivos++;
       //Sumamos el numero a sumPositivos
       sumPositivos +=numero;
           
       }else{
           //Aqui incrementamos a cantCeros en 1, para que al final nos muestre la cantidad de Ceros que hemos puesto
           cantCeros ++;
       }
      }
        
      if (cantPositivos > 0){
          mediaPositivos = (double) sumPositivos / cantPositivos;
      }
      
      if (cantNegativos > 0){
          mediaNegativos = (double) sumNegativos / cantNegativos;
      }
      
      mediaTotal = (double) sumaTotal /  numeros;
      
    }
     System.out.println("Has introducido " + cantPositivos + " números positivos");
      System.out.println("Todos juntos suman " + sumPositivos);
      System.out.println("Con una media de " + mediaPositivos);
      
      System.out.println("Has introducido " + cantNegativos + " números negativos");
      System.out.println("Todos juntos suman " + sumNegativos);
      System.out.println("Con una media de " + mediaNegativos);
      
      System.out.println("Has introducido " + cantCeros + " ceros");
      System.out.println("La suma total de todos los números es de " + sumaTotal + " con una media de " + mediaTotal);
}
}
