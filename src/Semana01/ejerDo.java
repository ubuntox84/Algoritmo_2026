/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author u
 */
public class ejerDo {

    public static void main(String[] args) {
        int intentosLogin = 0;
        do {
            intentosLogin++;
            System.out.println("Mostrando pantalla de Login... Intento " 
                    + intentosLogin);
        } while (intentosLogin < 3); // Cambiar a variables reales de autenticación

    }
}
