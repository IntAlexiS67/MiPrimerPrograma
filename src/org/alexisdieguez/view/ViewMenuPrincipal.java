package org.alexisdieguez.view;
import java.util.Scanner;
/**
 *
 * @author Alexis Diéguez :D
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Operaciones Matematicas");
            System.out.println("2. Texto");
            System.out.println("3. Logica ");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ControllerMatematicas.menu(sc);
                    break;
                case 2:
                    ControllerTexto.menu(sc);
                    break;
                case 3:
                    ControllerLogica.menu(sc);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);
    }
}
