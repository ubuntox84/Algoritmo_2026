/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

/**
 *
 * @author u
 */
public class ejer06_time {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
// Código a evaluar
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ns");
    }
}
