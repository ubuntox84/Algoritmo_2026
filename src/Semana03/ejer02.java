package Semana03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u
 */
public class ejer02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Semana03/datos.csv"));
            String linea;
            String separador = ",";

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                System.out.println("Nombre: " + datos[0]);
                System.out.println("Edad: " + datos[1]);
                System.out.println("Nota: " + datos[2]);
                System.out.println("-----");

            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();        }
    }
}
