/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

/**
 *
 * @author u
 */
class Persona {
        String nombre;
        int edad;

        void saludar() {
            System.out.println("Hola, mi nombre es " + nombre);
        }
    }
public class ejer04_clases { 
    public static void main(String[] args) {
        Persona p=new Persona();
        p.nombre="Christian";
        p.edad=35;
        p.saludar();
    }
}
