/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejer07_matris {

    public static void main(String[] args) {
        // Matriz de 3 filas y 4 columnas
        int[][] asientos = {
            {1, 1, 0, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 1}
        };
        int asientosLibres = 0;
// Recorrido de la matriz
        for (int fila = 0; fila < asientos.length; fila++) {
            for (int col = 0; col < asientos[fila].length; col++) {
                if (asientos[fila][col] == 0) {
                    asientosLibres++;
                }
            }
        }

        System.out.println("Total de asientos libres para la función: " 
                + asientosLibres);

    }
}
