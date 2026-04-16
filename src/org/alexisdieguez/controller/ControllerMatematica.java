/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alexisdieguez.controller;

/**
 *
 * @author AlexiS DiégueZ :D
 */
public class ControllerMatematica {

    public static double calcularSalario(double h, double p) {
        return h * p;
    }

    public static double areaTriangulo(double b, double h) {
        return (b * h) / 2;
    }

    public static double promedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static double celsiusFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double perimetroCirculo(double r) {
        return 2 * Math.PI * r;
    }

    public static double volumenCilindro(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double hipotenusa(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static int diasMinutos(int d) {
        return d * 24 * 60;
    }

    public static int residuo(int a, int b) {
        return a % b;
    }

    public static int cubo(int n) {
        return (int) Math.pow(n, 3);
    }
}
