/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alexisdieguez.controller;


/**
 *
 * @author Ivan Ramirez
 */


public class ControllerTexto {

    public static String nombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static int longitud(String palabra) {
        return palabra.length();
    }

    public static String invertir(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    public static String iniciales(String nombre, String apellido) {
        return "" + nombre.charAt(0) + apellido.charAt(0);
    }

    public static String mayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static String binario(String texto) {
        return (texto.length() % 2 == 0) ? "Par" : "Impar";
    }

    public static String repetir(String palabra, int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += palabra + " ";
        }
        return resultado;
    }

    public static String password(String pass) {
        return (pass.length() > 8) ? "Segura" : "Insegura";
    }

    public static String email(String nombre, String apellido, String dominio) {
        return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio;
    }
}
