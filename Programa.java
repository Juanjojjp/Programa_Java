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
        
