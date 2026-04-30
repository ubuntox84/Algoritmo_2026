/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejer05_While {
    public static void main(String[] args) {
        int bateria = 100;

        while (bateria > 20) {
            System.out.println("Sistema operando. Batería al " + bateria + "%");
            bateria -= 10; // Simulamos el consumo restando 10
        }
        System.out.println("Batería baja, por favor conecte el cargador.");

    }
}
