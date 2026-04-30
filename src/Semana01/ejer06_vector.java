/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejer06_vector {

    public static void main(String[] args) {
        // Declaramos un vector de 5 posiciones para almacenar notas
        double[] notasFinales = new double[5];

// Asignamos valores
        notasFinales[0] = 15.5;
        notasFinales[1] = 18.0;
        notasFinales[2] = 12.0;
        notasFinales[3] = 20.0;
        notasFinales[4] = 14.5;

        double suma = 0;

// Recorremos el vector con un bucle for
        for (int i = 0; i < notasFinales.length; i++) {
            suma = suma + notasFinales[i];
        }

        double promedio = suma / notasFinales.length;
        System.out.println("El promedio del aula es: " + promedio);

    }
}
