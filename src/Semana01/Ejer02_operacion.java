/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author u
 */
public class Ejer02_operacion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b, sum;
        System.out.println("Write a number A:");
        a=sc.nextInt();
        System.out.println("Write a number B");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("La suma es: "+sum);
    }
}
