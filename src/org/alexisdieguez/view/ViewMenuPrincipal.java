package org.alexisdieguez.view;
/**
 *
 * @author AlexiS Diéguez :D
 */
import org.alexisdieguez.controller.ControllerMatematica;
import org.alexisdieguez.controller.ControllerTexto;
import org.alexisdieguez.controller.ControllerLogica;

import java.util.Scanner;

public class ViewMenuPrincipal {
    //MENÚ DE MATEMÁTICAS
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

                case 1 -> {
                    System.out.print("Horas: ");
                    double h = sc.nextDouble();
                    System.out.print("Pago por hora: ");
                    double p = sc.nextDouble();
                    System.out.println("Salario: " + ControllerMatematica.calcularSalario(h, p));
                }

                case 2 -> {
                    System.out.print("Base: ");
                    double b = sc.nextDouble();
                    System.out.print("Altura: ");
                    double alt = sc.nextDouble();
                    System.out.println("Area: " + ControllerMatematica.areaTriangulo(b, alt));
                }

                case 3 -> {
                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();
                    System.out.print("Nota 3: ");
                    double n3 = sc.nextDouble();
                    System.out.println("Promedio: " + ControllerMatematica.promedio(n1, n2, n3));
                }

                case 4 -> {
                    System.out.print("Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit: " + ControllerMatematica.celsiusFahrenheit(c));
                }

                case 5 -> {
                    System.out.print("Radio: ");
                    double r = sc.nextDouble();
                    System.out.println("Perimetro: " + ControllerMatematica.perimetroCirculo(r));
                }

                case 6 -> {
                    System.out.print("Radio: ");
                    double r2 = sc.nextDouble();
                    System.out.print("Altura: ");
                    double h2 = sc.nextDouble();
                    System.out.println("Volumen: " + ControllerMatematica.volumenCilindro(r2, h2));
                }

                case 7 -> {
                    System.out.print("Cateto A: ");
                    double a = sc.nextDouble();
                    System.out.print("Cateto B: ");
                    double bb = sc.nextDouble();
                    System.out.println("Hipotenusa: " + ControllerMatematica.hipotenusa(a, bb));
                }

                case 8 -> {
                    System.out.print("Dias: ");
                    int d = sc.nextInt();
                    System.out.println("Minutos: " + ControllerMatematica.diasMinutos(d));
                }

                case 9 -> {
                    System.out.print("Dividendo: ");
                    int x = sc.nextInt();
                    System.out.print("Divisor: ");
                    int y = sc.nextInt();
                    System.out.println("Residuo: " + ControllerMatematica.residuo(x, y));
                }

                case 10 -> {
                    System.out.print("Numero: ");
                    int num = sc.nextInt();
                    System.out.println("Cubo: " + ControllerMatematica.cubo(num));
                }

                case 11 -> System.out.println("Regresando al menu principal...");

                default -> System.out.println("Opcion invalida");
            }

        } while (opcion != 11);
    }
    
    public void menuTexto(java.util.Scanner sc) {

    int opcion;

    do {
        System.out.println("\n--- MENU TEXTO ---");
        System.out.println("1. Nombre completo");
        System.out.println("2. Longitud");
        System.out.println("3. Invertir texto");
        System.out.println("4. Es vocal");
        System.out.println("5. Iniciales");
        System.out.println("6. Mayusculas");
        System.out.println("7. Binario par/impar");
        System.out.println("8. Repetir palabra");
        System.out.println("9. Validar password");
        System.out.println("10. Generar email");
        System.out.println("11. Regresar");
        System.out.print("Opcion: ");

        opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {

            case 1 -> {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc.nextLine();
                System.out.println(ControllerTexto.nombreCompleto(nombre, apellido));
            }

            case 2 -> {
                System.out.print("Palabra: ");
                String palabra = sc.nextLine();
                System.out.println("Longitud: " + ControllerTexto.longitud(palabra));
            }

            case 3 -> {
                System.out.print("Texto: ");
                String texto = sc.nextLine();
                System.out.println(ControllerTexto.invertir(texto));
            }

            case 4 -> {
                System.out.print("Caracter: ");
                char c = sc.next().charAt(0);
                System.out.println(ControllerTexto.esVocal(c));
            }

            case 5 -> {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc.nextLine();
                System.out.println(ControllerTexto.iniciales(nombre, apellido));
            }

            case 6 -> {
                System.out.print("Texto: ");
                String texto = sc.nextLine();
                System.out.println(ControllerTexto.mayusculas(texto));
            }

            case 7 -> {
                System.out.print("Texto binario: ");
                String texto = sc.nextLine();
                System.out.println(ControllerTexto.binario(texto));
            }

            case 8 -> {
                System.out.print("Palabra: ");
                String palabra = sc.nextLine();
                System.out.print("Veces: ");
                int n = sc.nextInt();
                System.out.println(ControllerTexto.repetir(palabra, n));
            }

            case 9 -> {
                System.out.print("Password: ");
                String pass = sc.nextLine();
                System.out.println(ControllerTexto.password(pass));
            }

            case 10 -> {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Dominio: ");
                String dominio = sc.nextLine();
                System.out.println(ControllerTexto.email(nombre, apellido, dominio));
            }

            case 11 -> System.out.println("Regresando...");

            default -> System.out.println("Opcion invalida");
        }

    } while (opcion != 11);
}
    public void menuLogica(java.util.Scanner sc) {

    int opcion;

    do {
        System.out.println("\n--- MENU LOGICA ---");
        System.out.println("1. Mayor de edad");
        System.out.println("2. Numero par");
        System.out.println("3. Semaforo");
        System.out.println("4. En rango");
        System.out.println("5. Login");
        System.out.println("6. Mayor de dos");
        System.out.println("7. Año bisiesto");
        System.out.println("8. Aprobado");
        System.out.println("9. Es triangulo");
        System.out.println("10. Comparar cadenas");
        System.out.println("11. Regresar");
        System.out.print("Opcion: ");

        opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {

            case 1 -> {
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.println(ControllerLogica.esMayorEdad(edad));
            }

            case 2 -> {
                System.out.print("Numero: ");
                int num = sc.nextInt();
                System.out.println(ControllerLogica.esPar(num));
            }

            case 3 -> {
                System.out.print("Color: ");
                String color = sc.nextLine();
                System.out.println(ControllerLogica.semaforo(color));
            }

            case 4 -> {
                System.out.print("Numero: ");
                int num = sc.nextInt();
                System.out.print("Min: ");
                int min = sc.nextInt();
                System.out.print("Max: ");
                int max = sc.nextInt();
                System.out.println(ControllerLogica.enRango(num, min, max));
            }

            case 5 -> {
                System.out.print("Usuario: ");
                String user = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();
                System.out.println(ControllerLogica.login(user, pass));
            }

            case 6 -> {
                System.out.print("Numero 1: ");
                int a = sc.nextInt();
                System.out.print("Numero 2: ");
                int b = sc.nextInt();
                System.out.println("Mayor: " + ControllerLogica.mayor(a, b));
            }

            case 7 -> {
                System.out.print("Año: ");
                int anio = sc.nextInt();
                System.out.println(ControllerLogica.bisiesto(anio));
            }

            case 8 -> {
                System.out.print("Nota: ");
                double nota = sc.nextDouble();
                System.out.println(ControllerLogica.aprobado(nota));
            }

            case 9 -> {
                System.out.print("Lado 1: ");
                double l1 = sc.nextDouble();
                System.out.print("Lado 2: ");
                double l2 = sc.nextDouble();
                System.out.print("Lado 3: ");
                double l3 = sc.nextDouble();
                System.out.println(ControllerLogica.esTriangulo(l1, l2, l3));
            }

            case 10 -> {
                System.out.print("Cadena 1: ");
                String c1 = sc.nextLine();
                System.out.print("Cadena 2: ");
                String c2 = sc.nextLine();
                System.out.println(ControllerLogica.comparar(c1, c2));
            }

            case 11 -> System.out.println("Regresando...");

            default -> System.out.println("Opcion invalida");
        }

    } while (opcion != 11);
}

    public void mostrarMenu() {
        
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Matematicas");
            System.out.println("2. Texto");
            System.out.println("3. Logica");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {

                case 1 -> menuMatematicas(sc);

                case 2 -> menuTexto(sc);

                case 3 -> menuLogica(sc);

                case 4 -> System.out.println("Saliendo...");

                default -> System.out.println("Opcion invalida");
            }

        } while (opcionPrincipal != 4);
    }
}
