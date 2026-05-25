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
        System.out.println("Sonido genérico");
    }
}
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}
public class ejer07_Poli {
    public static void main(String[] args) {
        Animal a1 = new Gato();
        Animal a2 = new Perro();

        a1.hacerSonido();
        a2.hacerSonido();

    }
}
