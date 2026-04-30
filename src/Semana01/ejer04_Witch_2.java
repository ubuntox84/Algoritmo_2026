/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejer04_Witch_2 {
    public static void main(String[] args) {
        int opcionMenu = 2;
        switch (opcionMenu) {
            case 1:
                System.out.println("Ejecutando SELECT...");
                break; // El break es crucial para salir del switch
            case 2:
                System.out.println("Ejecutando INSERT...");
                break;
            case 3:
                System.out.println("Ejecutando UPDATE...");
                break;
            default:
                System.out.println("Error: Operación SQL no válida.");
        }
    }
}
