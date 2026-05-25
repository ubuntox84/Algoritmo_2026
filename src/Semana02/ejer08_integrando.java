/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

/**
 *
 * @author u
 */
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) {
        saldo += monto;
    }
}
class CuentaAhorro extends Cuenta {
    public CuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }
    // Polimorfismo (sobrescritura)
    @Override
    public void depositar(double monto) {
        System.out.println("Depósito en cuenta ahorro");
        super.depositar(monto);
    }
}
public class ejer08_integrando {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorro(100);
        cuenta.depositar(50);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
