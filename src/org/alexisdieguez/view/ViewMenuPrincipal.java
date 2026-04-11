package org.alexisdieguez.view;
/**
 *
 * @author Alexis Diéguez :D
 */
import java.util.Scanner;
import org.alexisdieguez.controller.ControllerLogica;
import org.alexisdieguez.controller.ControllerMatematica;
import org.alexisdieguez.controller.ControllerTexto;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Operaciones Matematicas");
            System.out.println("2. Cadenas");
            System.out.println("3. Logica");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {

                case 1:
                    menuMatematicas(sc);
                    break;

                case 2:
                    System.out.println("Menu de Cadenas (pendiente)");
                    break;

                case 3:
                    System.out.println("Menu de Logica (pendiente)");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcionPrincipal != 4);
    }

    // 🔹 SUBMENÚ DE MATEMÁTICAS
    public static void menuMatematicas(Scanner sc) {

        int opcion;

        do {
            System.out.println("\n--- MENU MATEMATICAS ---");
            System.out.println("1. Salario");
            System.out.println("2. Area Triangulo");
            System.out.println("3. Promedio");
            System.out.println("4. Celsius a Fahrenheit");
            System.out.println("5. Perimetro Circulo");
            System.out.println("6. Volumen Cilindro");
            System.out.println("7. Hipotenusa");
            System.out.println("8. Dias a Minutos");
            System.out.println("9. Residuo");
            System.out.println("10. Cubo");
            System.out.println("11. Regresar");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Horas: ");
                    double h = sc.nextDouble();
                    System.out.print("Pago por hora: ");
                    double p = sc.nextDouble();
                    System.out.println("Salario: " + ControllerMatematica.calcularSalario(h, p));
                    break;

                case 2:
                    System.out.print("Base: ");
                    double b = sc.nextDouble();
                    System.out.print("Altura: ");
                    double alt = sc.nextDouble();
                    System.out.println("Area: " + ControllerMatematica.areaTriangulo(b, alt));
                    break;

                case 3:
                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();
                    System.out.print("Nota 3: ");
                    double n3 = sc.nextDouble();
                    System.out.println("Promedio: " + ControllerMatematica.promedio(n1, n2, n3));
                    break;

                case 4:
                    System.out.print("Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit: " + ControllerMatematica.celsiusFahrenheit(c));
                    break;

                case 5:
                    System.out.print("Radio: ");
                    double r = sc.nextDouble();
                    System.out.println("Perimetro: " + ControllerMatematica.perimetroCirculo(r));
                    break;

                case 6:
                    System.out.print("Radio: ");
                    double r2 = sc.nextDouble();
                    System.out.print("Altura: ");
                    double h2 = sc.nextDouble();
                    System.out.println("Volumen: " + ControllerMatematica.volumenCilindro(r2, h2));
                    break;

                case 7:
                    System.out.print("Cateto A: ");
                    double a = sc.nextDouble();
                    System.out.print("Cateto B: ");
                    double bb = sc.nextDouble();
                    System.out.println("Hipotenusa: " + ControllerMatematica.hipotenusa(a, bb));
                    break;

                case 8:
                    System.out.print("Dias: ");
                    int d = sc.nextInt();
                    System.out.println("Minutos: " + ControllerMatematica.diasMinutos(d));
                    break;

                case 9:
                    System.out.print("Dividendo: ");
                    int x = sc.nextInt();
                    System.out.print("Divisor: ");
                    int y = sc.nextInt();
                    System.out.println("Residuo: " + ControllerMatematica.residuo(x, y));
                    break;

                case 10:
                    System.out.print("Numero: ");
                    int num = sc.nextInt();
                    System.out.println("Cubo: " + ControllerMatematica.cubo(num));
                    break;

                case 11:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 11);
    }
}