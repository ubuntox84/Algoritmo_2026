/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

/**
 *
 * @author u
 */
class Estudiante {

    String nombre;
    int nota;

    // Constructor
    Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    void mostrar() {
        System.out.println("Estudiante: " + nombre + ", Nota: " + nota);
    }
}
public class ejer05_const {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 18);
        Estudiante e2 = new Estudiante("Luis", 15);

        e1.mostrar();
        e2.mostrar();
    }
}
