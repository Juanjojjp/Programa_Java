import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Programa {
    public static void main(String[] args) {
        // Inicio del codigo
        // Apertura de Scanner para solicitar inputs
        Scanner datosEntrada = new Scanner(System.in);
        Scanner datosExtras = new Scanner(System.in);
        
        System.out.println("\nCual es su nombre: ");
        String nombre = datosEntrada.nextLine();
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nBienvenido "+nombre);
        boolean seguir = true;
        // Inicio del bucle del programa
        
        while (seguir == true) {
            // Opciones a elegir
            System.out.println("\nQue accion deseas realizar "+ nombre+":\n1) Calcular su signo del zodiaco.\n2) Calcular los días vividos desde su fecha de nacimiento.\n3) Calcular su edad en años de perro.\n4) Calcular el número según la numerología.\n5) Creditos.\n6) Salir.\n");
            System.out.println("Escoge una opcion entre: 1 - 2 - 3 - 4 - 5 - 6");
            // Codigo a realizar si pone un numero
            try {
                // Pide que accion desea realizar segun el numero
                int accion = datosEntrada.nextInt(); 
                // Le dara su signo del zodiaco segun su fecha de nacimiento
