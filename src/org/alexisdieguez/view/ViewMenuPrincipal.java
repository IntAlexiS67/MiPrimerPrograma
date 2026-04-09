package org.alexisdieguez.view;
import java.util.Scanner;
/**
 *
 * @author Alexis Diéguez :D
 */
public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);        
           public void mostrarMenu(){
                   //LOCAL
                   while (opcionMenu == 0){
                       System.out.println("Bienvenido0, Seleccione una opción: ");
                       opcionMenu= Integer.parseInt(leer.nextLine());
           }
    }
    public void mostrarMenuMatematica(){
        System.out.println("Menú de operaciones matemáticas");
    }
}