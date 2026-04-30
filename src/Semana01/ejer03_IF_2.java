/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejer03_IF_2 {
    public static void main(String[] args) {
        double temperatura = 85.5;
    if (temperatura <= 60.0) {
        System.out.println("Estado: Óptimo.");
    } else if (temperatura > 60.0 && temperatura < 80.0) {
        System.out.println("Advertencia: Temperatura elevada. "
                + "Encendiendo ventiladores extra.");
    } else {
        System.out.println("¡PELIGRO! Sobrecalentamiento. "
                + "Apagando sistema de emergencia.");
    }

    }
}
