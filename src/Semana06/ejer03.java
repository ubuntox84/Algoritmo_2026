/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author u
 */
public class ejer03 {
    static void mostrarv(Queue <Integer> lista){
        for(Integer dato:lista){
            System.out.print(dato+"\t");
        }
    }
    public static void main(String[] args) {
        Queue <Integer> lista=new LinkedList<>();
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.add(7);
        lista.add(4);
        lista.add(9);
        lista.add(1);
        mostrarv(lista);
        System.out.println("");
        lista.poll();
        mostrarv(lista);
    }
}
