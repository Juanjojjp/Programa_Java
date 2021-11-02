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
        System.out.println("\nBienvenido "+nombre+"!");
        boolean seguir = true;
        // Inicio del bucle del programa
        
        while (seguir == true) {
            // Opciones a elegir
            System.out.println("   ________________________________________");
            System.out.println(" / \\                                       \\.");
            System.out.println("|   |                                      |.");
            System.out.println(" \\_ |                                      |.");
            System.out.println("    |      Que accion deseas realizar      |.");
            System.out.println("    |                                      |.");
            System.out.println("    | 1) Calcular su signo del zodiaco.    |.");
            System.out.println("    | 2) Calcular los días vividos.        |.");
            System.out.println("    | 3) Calcular su edad en años perro.   |.");
            System.out.println("    | 4) Calcular su número de numerología.|.");
            System.out.println("    | 5) Creditos.                         |.");
            System.out.println("    | 6) Salir.                            |.");
            System.out.println("    |                                      |.");
            System.out.println("    | Escoge una opcion entre:             |.");
            System.out.println("    | 1 - 2 - 3 - 4 - 5 - 6                |.");
            System.out.println("    |   ___________________________________|___");
            System.out.println("    |  /                                      /.");
            System.out.println("    \\_/______________________________________/.");
            // Codigo a realizar si pone un numero
            try {
                // Pide que accion desea realizar segun el numero
                int accion = datosEntrada.nextInt(); 
                // Le dara su signo del zodiaco segun su fecha de nacimiento
                if (accion == 1) {
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Para saber tu signo del zodiaco deberas poner tu mes y dia de nacimiento...\n");
                    System.out.println("Pon tu mes de nacimiento (Pon unicamente el numero correspondiente): \n");
                    
                    System.out.println(".-=~=-.                                   .-=~=-.");
                    System.out.println("(__  _)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(__  _)");
                    System.out.println("( _ __)                                   ( _ __)");
                    System.out.println("(__  _)               Meses               (__  _)");
                    System.out.println("(_ ___)                                   (_ ___)");
                    System.out.println("(__  _)          Enero (1)                (__  _)");
                    System.out.println("( _ __)          Febrero (2)              ( _ __)");
                    System.out.println("(__  _)          Marzo (3)                (__  _)");
                    System.out.println("(_ ___)          Abril (4)                (_ ___)");
                    System.out.println("(__  _)          Mayo (5)                 (__  _)");
                    System.out.println("( _ __)          Junio (6)                ( _ __)");
                    System.out.println("(__  _)          Julio (7)                (__  _)");
                    System.out.println("(__  _)          Agosto (8)               (__  _)");
                    System.out.println("(_ ___)          Septiembre (9)           (_ ___)");
                    System.out.println("(__  _)          Octubre (10)             (__  _)");
                    System.out.println("(__  _)          Noviembre (11)           (__  _)");
                    System.out.println("(__  _)          Diciembre (12)           (__  _)");
                    System.out.println("(__  _)                                   (__  _)");     
                    System.out.println("(_ ___)-._.-=-._.-=-._.-=-._.-=-._.-=-._.-(_ ___)");
                    System.out.println("`-._.-'                                   `-._.-'");
                    System.out.println("\nEscoge una opcion: ");
                    
                    int mes = datosEntrada.nextInt();

                    System.out.println("\nAhora pon tu dia de nacimiento: ");
                    int dia = datosEntrada.nextInt();
                    // Acuario
                    if (mes == 1 && dia >= 21 && dia <= 31 || mes == 2 && dia >= 1 && dia <= 19) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Acuario *");
                        System.out.println("------------------------------------------------------------\n");
                        Thread.sleep(2*1000);
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Aire.\n- Piedra: Amatista.\n- Puntos fuertes: innovador y vanguardista.\n- Colores: violeta, azul y cobalto.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Piscis
                    if (mes == 2 && dia >= 20 && dia <= 29 || mes == 3 && dia >= 1 && dia <= 20) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Piscis *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Agua.\n- Piedra: zafiro agua marina.\n- Puntos fuertes: tacto y tenacidad.\n- Color: azul.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Aries
                    if (mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia >= 1 && dia <= 20) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Aries *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Fuego.\n- Piedras: rubís, amatistas.\n- Puntos fuertes: rapidez y fuerza.\n- Color: rojo.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Tauro
                    if (mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia >= 1 && dia <= 21) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Tauro *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Tierra.\n- Piedras: Esmeralda y Aguamarina.\n- Puntos fuertes: resistencia, prudencia y solidez.\n- Color: verde.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Géminis
                    if (mes == 5 && dia >= 22 && dia <= 31 || mes == 6 && dia >= 1 && dia <= 21) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Géminis *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Aire.\n- Piedras: Jade y Turquesa.\n- Puntos fuertes: agilidad, flexibilidad y adaptación.\n- Color: multicolor.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Cáncer
                    if (mes == 6 && dia >= 22 && dia <= 30 || mes == 7 && dia >= 1 && dia <= 22) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Cáncer *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Agua.\n- Piedras: ópalo y piedra fina.\n- Puntos fuertes: perseverancia, imaginación y creatividad.\n- Colores: blanco y gris perla.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Leo
                    if (mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia >= 1 && dia <= 23) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Leo *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Fuego.\n- Piedras: topacio y diamante.\n- Puntos fuertes: bondad y organización.\n- Colores: amarillo y naranja.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Virgo
                    if (mes == 8 && dia >= 24 && dia <= 31 || mes == 9 && dia >= 1 && dia <= 23) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Virgo *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Tierra.\n- Piedras: ágata y jaspe.\n- Puntos fuertes: precisión y lógica.\n- Colores: beige y gris.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Libra
                    if (mes == 9 && dia >= 24 && dia <= 30 || mes == 10 && dia >= 1 && dia <= 23) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Libra *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Aire.\n- Piedras: zafiro y coral.\n- Puntos fuertes: equilibrio, justicia y paz.\n- Color: pastel.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Escorpio
                    if (mes == 10 && dia >= 24 && dia <= 31 || mes == 11 && dia >= 1 && dia <= 22) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Escorpio *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Agua.\n- Piedras: Granate y rubí.\n- Puntos fuertes: Tenacidad y tacto.\n- Colores: rojo y gris.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Sagitario
                    if (mes == 11 && dia >= 23 && dia <= 30 || mes == 12 && dia >= 1 && dia <= 21) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Sagitario *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Fuego.\n- Piedra: granate zafiro.\n- Punto fuerte: optimismo.\n- Colores: azul noche y rojo.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Capricornio
                    if (mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia >= 1 && dia <= 20) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println(nombre + " tu signo zodiacal es:\n* Capricornio *");
                        Thread.sleep(2*1000);
                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Deseas conocer informacion extra sobre tu signo zodiacal?  (Y/N)");
                        char siNo = datosExtras.next().charAt(0);
                        // Da informacion extra respecto al signo
                        if (siNo == 'y' || siNo == 'Y'){
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Informacion extra\n");
                            System.out.println("- Elemento: Tierra.\n- Piedra: ónix azabache.\n- Punto fuerte: resistencia.\n- Colores: negro y rojo.");
                            Thread.sleep(8*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                        // Cierra el programa en cuyo caso que se pusieran datos incorrectos
                        else if (siNo != 'N' && siNo != 'n' && siNo != 'Y' && siNo != 'y') {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Pusiste un dato no valido.");
                            Thread.sleep(1*1000);
                            System.out.println("\nCerrando programa...\n");
                            Thread.sleep(2*1000);
                        }
                        // Vuelve a iniciar el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Espero que haya sido de utilidad.");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    } 
                    else {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("Has puesto un mes o un dia que no existen");
                        Thread.sleep(2 * 1000);
                        System.out.println("\nRegresando al programa...");
                        Thread.sleep(2 * 1000);
                        System.out.println("------------------------------------------------------------");
                        continue;
                    }
                }
                // Le dira cuantos dias ah vivido
                 else if (accion == 2) {
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Para calcular los dias vividos vamos a pedirte tu fecha de nacimiento.\n"); 
                    System.out.println("Porfavor Introduzaca el año en el que nacio:");
                    int yearNacimiento = datosEntrada.nextInt();
                    System.out.println("Porfavor Introduzaca el numero del mes en el que nacio:");
                    int mesNacimiento = datosEntrada.nextInt();
                    System.out.println("Porfavor Introduzaca el dia en el que nacio:");
                    int diaNacimiento = datosEntrada.nextInt();
                    // Formato para ver la fecha actual
                    DateTimeFormatter fechaActualYear = DateTimeFormatter.ofPattern("yyyy");
                    DateTimeFormatter fechaActualMes = DateTimeFormatter.ofPattern("MM");
                    DateTimeFormatter fechaActualDia = DateTimeFormatter.ofPattern("dd");

                    String fechaYear = fechaActualYear.format(LocalDateTime.now());
                    String fechaMes = fechaActualMes.format(LocalDateTime.now());
                    String fechaDia = fechaActualDia.format(LocalDateTime.now());
                    // Cambia la fecha que esta en string por valores enteros
                    int fechaIntYear = Integer.valueOf (fechaYear);
                    int fechaIntMes = Integer.valueOf (fechaMes);
                    int fechaIntDia = Integer.valueOf (fechaDia);
                    // Comandos a realizar para saber los dias
                    try {
                        if (yearNacimiento > 0 && yearNacimiento < 2022 && mesNacimiento > 0 && mesNacimiento <= 12 && diaNacimiento > 0 && diaNacimiento <= 31) {
                            int years_a_dias = (fechaIntYear - yearNacimiento)*365;
                            if (mesNacimiento > fechaIntMes) {
                                int mes_a_dias = (mesNacimiento - fechaIntMes)*30;
                                if (diaNacimiento >= fechaIntDia) {
                                    int dia = (diaNacimiento - fechaIntDia);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                                if (diaNacimiento < fechaIntDia) {
                                    int dia = (fechaIntDia - diaNacimiento);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                            }
                            else if (mesNacimiento < fechaIntMes) {
                                int mes_a_dias = (fechaIntMes - mesNacimiento )*30;
                                if (diaNacimiento >= fechaIntDia) {
                                    int dia = (diaNacimiento - fechaIntDia);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                                if (diaNacimiento < fechaIntDia) {
                                    int dia = (fechaIntDia - diaNacimiento);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                            }
                            else {
                                int mes_a_dias = 0;
                                if (diaNacimiento >= fechaIntDia) {
                                    int dia = (diaNacimiento - fechaIntDia);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                                if (diaNacimiento < fechaIntDia) {
                                    int dia = (fechaIntDia - diaNacimiento);
                                    int dias_vividos = years_a_dias+mes_a_dias+dia;
                                    System.out.println("\nHas vivido "+dias_vividos+" dias.");
                                    Thread.sleep(4 * 1000);
                                    continue;
                                }
                            }                           
                        }
                        // Si se pone un dato que no existe se reinicia el bucle
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("Has puesto un año, un mes o un dia que no existen");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");
                            continue;
                        }
                    }
                    // Si se pone un string cierra el programa
                    catch (Exception InputMismatchException) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("   Solo se permiten numeros, vuelve a ejecutar el codigo.");
                        System.out.println("------------------------------------------------------------\n");
                        break;
                    }
                }
                // Si ponen 3 dara sus años en años perro
                else if (accion == 3) {
                    try {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("Para calcular cuantos años perros tiene usted, debemos saber cuantos años tiene.\n");             
                        System.out.println("Cuantos años tiene:");
                        int yearsActuales = datosExtras.nextInt();
                        int yearsPerro = yearsActuales/7;
                        System.out.println(nombre+" tienes "+yearsActuales+" años, y en perro equivalen a "+yearsPerro+" años perros.");             
                        Thread.sleep(4*1000);
                        System.out.println("\nRegresando al programa...");
                        Thread.sleep(2*1000);
                         System.out.println("------------------------------------------------------------");
                        continue;
                    }
                    // Excepcion por si pone algo diferente a un numero
                    catch (Exception InputMismatchException) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("   Solo se permiten numeros, vuelve a ejecutar el codigo.");
                        System.out.println("------------------------------------------------------------\n");
                        break;
                    }
                }
                // Si ponen 4 hara la funcion de ver la numerologia dependiendo de una fecha
                else if (accion == 4) {
                    try {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("Calcular el número según la numerología, para esto debemos saber cual es el dia de su nacimiento.");
                        System.out.println("Cual es su dia de nacimiento:");
                        int dia_nacimiento = datosExtras.nextInt();
                        // El codigo que se ejecutara si pone una fecha igual o menor a 31
                        if (dia_nacimiento <= 31) {
                            String diaStr = String.valueOf(dia_nacimiento);
                            char cifra;
                            int valor=0, res=0;
                            // Separa el numero
                            for(int i = 0; i < diaStr.length(); i++) {
                                cifra = diaStr.charAt(i);
                                valor = Character.getNumericValue(cifra);
                                res = res + valor;
                            }
                            // Da la numerologia
                            System.out.println("\n"+nombre+" su numerología es: "+res);
                            Thread.sleep(4*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------"); 
                            continue;
}
                        else {
                            System.out.println("\n------------------------------------------------------------");
                            System.out.println("No puso un numero valido");
                            Thread.sleep(2*1000);
                            System.out.println("\nRegresando al programa...");
                            Thread.sleep(2*1000);
                            System.out.println("------------------------------------------------------------");                           
                            continue;
                        }
                    }
                    catch (Exception InputMismatchException) {
                        System.out.println("\n------------------------------------------------------------");
                        System.out.println("   Solo se permiten numeros, vuelve a ejecutar el codigo.");
                        System.out.println("------------------------------------------------------------\n");
                        break;
                    }
    
                }
                // Si ponen 5 se veran los creditos de quienes lo crearon
                else if (accion == 5) {
                    System.out.println("\n __| |____________________________________________| |__");
                    System.out.println("(__   ____________________________________________   __)");
                    System.out.println("   | |                                            | |");
                    System.out.println("   | |                 Creadores                  | |");
                    System.out.println("   | |                                            | |");
                    System.out.println("   | |           Juan Jose Perez Franco           | |");
                    System.out.println("   | |                                            | |");
                    System.out.println("   | |      Carlos Daniel Bohorquez Bolanos       | |");
                    System.out.println(" __| |____________________________________________| |__");
                    System.out.println("(__   ____________________________________________   __)");
                    System.out.println("   | |                                            | |");
                    Thread.sleep(5*1000);
                    System.out.println("\nRegresando al programa...");
                    System.out.println("------------------------------------------------------------");
                    Thread.sleep(2*1000);
                    continue;
}
                // Si ponen 6 se va a cerra el bucle, lo cual cierra el programa
                else if (accion == 6) {
                    System.out.println("\nHasta la proxima "+nombre+"!\n");
                    seguir = false;
                }
                // Vuelve a iniciar el bucle en cuyo caso que ponga un numero diferente a las opciones dadas
                else {
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Pon una opcion valida entre 1, 2, 3, 4, 5 o 6.");
                    Thread.sleep(4*1000);
                    System.out.println("------------------------------------------------------------");
                    continue;
                }
            }
            // Excepcion en cuyo caso se escriba algo diferente a un numero
            catch (Exception InputMismatchException) {
                System.out.println("\n------------------------------------------------------------");
                System.out.println("   Solo se permiten numeros, vuelve a ejecutar el codigo.");
                System.out.println("------------------------------------------------------------\n");
                seguir = false;
            }
            // Cierre del scanner
            datosEntrada.close();
            datosExtras.close();
        }

    }
}
