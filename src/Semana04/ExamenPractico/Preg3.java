/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04.ExamenPractico;

/**
 *
 * @author u
 */
class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Saldo insuficiente o monto invalido");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
public class Preg3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        cuenta.depositar(50);
        cuenta.retirar(30);
        cuenta.retirar(200);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
