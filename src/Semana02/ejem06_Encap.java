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

    private String nombre;  // atributo privado

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
public class ejem06_Encap {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Carlos");

        System.out.println(p.getNombre());
    }
}
