/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04.ExamenPractico;

/**
 *
 * @author u
 */
class Vehiculo {
    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void moverse() {
        System.out.println("El vehiculo se esta moviendo");
    }
}

class Auto extends Vehiculo {

    public Auto(String marca, int velocidad) {
        super(marca, velocidad);
    }

    @Override
    public void moverse() {
        System.out.println("El auto se mueve con motor");
    }
}

class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, int velocidad) {
        super(marca, velocidad);
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve pedaleando");
    }
}
public class Preg2 {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto("Toyota", 120);
        Vehiculo v2 = new Bicicleta("Oxford", 25);

        v1.moverse();
        v2.moverse();
    }
}
