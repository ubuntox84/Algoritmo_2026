/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

/**
 *
 * @author u
 */
class Animal {

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    void ladrar() {
        System.out.println("El perro ladra");
    }
}

public class ejer06_herencia {

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.hacerSonido(); // heredado
        miPerro.ladrar();      // propio
    }
}
