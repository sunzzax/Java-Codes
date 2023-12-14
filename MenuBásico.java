
package ProgUsuarioLib;
import java.util.Scanner;

public class ProgUsuario { 

    public static void main(String[] args) { 
        // Aquí se inician las variables y arrays que se van a utilizar en el programa
        int seleccion=-1;   // Esta variable almacena la opción seleccionada por el usuario
        int indice=0;   // Esta variable lleva la cuenta de cuántos usuarios se han añadido al sistema
        String[] nombres=new String[20];    // Este array almacena los nombres de los usuarios
        String[] telefonos=new String[20];   // Este array almacena los teléfonos de los usuarios

        // Este bucle se ejecuta mientras la selección del usuario sea diferente de 0
        while(seleccion!=0){
            // Dependiendo de la opción seleccionada por el usuario, se ejecuta una acción
            switch(seleccion){
                case 1 -> {
                    // Si el usuario selecciona la opción 1, se llama a la función alta_usuario
                    indice=alta_usuario(nombres,telefonos,indice);
                }
                
                case 2 -> {
                    // Cuando el usuario selecciona 0, se sale del bucle y se muestra un mensaje de despedida
                    System.out.println("Gracias por utilizar programa manejo de usuarios");
                }
                
            }
            // Se llama a la función controlprincipal para obtener la próxima selección del usuario
            seleccion=controlprincipal();
        }

        // Cuando el usuario selecciona 0, se sale del bucle y se muestra un mensaje de despedida
        System.out.println("Gracias por utilizar programa manejo de usuarios");
    }

    public static int controlprincipal(){
        // Esta función muestra un menú al usuario y recoge su selección
        Scanner scan=new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Control de Selección");
        System.out.println("");
        System.out.println("1. Alta de usuario");
        System.out.println("0. Salir del programa");
        System.out.println("");

        System.out.println("Introduzca selección: ");

        int selec = -1;
        
        try {
            // Se intenta recoger la selección del usuario como un número entero
            selec = scan.nextInt();
            
        } catch (Exception e) {
            // Si el usuario no introduce un número entero, se muestra un mensaje de error
            System.out.println("Por favor, introduzca un número entero válido.");
        }

        // Se devuelve la selección del usuario
        return selec;
    }

    public static int alta_usuario(String[] lista_nombres, String[] lista_telefonos, int last_pos){
        
     // Esta función se encarga de añadir un nuevo usuario al sistema
     Scanner scan=new Scanner(System.in);

    if (last_pos < 20) {
        // Si aún no se ha alcanzado el límite de usuarios, se pide al usuario que introduzca el nombre y el teléfono del nuevo usuario
        
        try {
           
         System.out.println("Introduzca el nombre del usuario: ");
         lista_nombres[last_pos]= scan.nextLine();
         
         System.out.println("Introduce un teléfono para el usuario");
        lista_telefonos[last_pos] = scan.nextLine();
         
         // Se muestra un mensaje confirmando que el usuario ha sido añadido
        System.out.println("Usuario añadido: " + lista_nombres[last_pos] + ", Teléfono: " + lista_telefonos[last_pos]);
         
        System.out.println("Pulse cualquier tecla para continuar");
        scan.nextLine();
        
        // Si todo sale bien se devuelve last_pos incrementado
        return last_pos + 1;
        }
        
        catch(Exception e) {
            
            System.out.println ("Algo ha fallado... Por favor introduzca un usuario y telefono nuevo");
            
            //Dejamos en blanco el espacio
            lista_nombres[last_pos] = (null);
            lista_telefonos[last_pos] = (null);
            
            //Devolvemos last_pos sin modificar
            return last_pos;
        }

        } else {
        // Si se ha alcanzado el límite de usuarios, se muestra un mensaje de error
        System.out.println("Se ha llegado al tamaño máximo de usuarios");
        System.out.println("Pulse cualquier tecla para continuar");
        scan.nextLine();

        // Se devuelve last_pos sin modificar
        return last_pos;
       
        }
    }
}
