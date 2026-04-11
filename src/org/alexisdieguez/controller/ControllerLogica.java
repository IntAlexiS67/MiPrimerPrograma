/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alexisdieguez.controller;

/**
 *
 * @author Emilio Pinzon
 */

public class ControllerLogica {

    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static String semaforo(String color) {
        color = color.toLowerCase();
        return switch (color) {
            case "verde" -> "Avanzar";
            case "amarillo" -> "Precaucion";
            case "rojo" -> "Detenerse";
            default -> "Color invalido";
        };
    }

    public static boolean enRango(int num, int min, int max) {
        return num >= min && num <= max;
    }

    public static boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }

    public static int mayor(int a, int b) {
        return (a > b) ? a : b;
    }

    public static boolean bisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static boolean aprobado(double nota) {
        return nota >= 60;
    }

    public static boolean esTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean comparar(String a, String b) {
        return a.equals(b);
    }
}
