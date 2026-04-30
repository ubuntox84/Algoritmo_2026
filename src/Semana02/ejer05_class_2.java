/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

class Auto {
    String marca;
    int velocidad;

    void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando. Velocidad actual: " + velocidad);
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad);
    }
}

public class ejer05_class_2 {
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.marca = "Toyota";
        miAuto.velocidad = 0;

        miAuto.mostrarInfo();
        miAuto.acelerar();
        miAuto.acelerar();
    }

}
