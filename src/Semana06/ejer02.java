/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author u
 */
public class ejer02 {
    public static void main(String[] args) {
        Set <Integer> lista=new HashSet<>();
        lista.add(1);
        lista.add(2);
        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(3);
        for(Integer valor: lista){
            System.out.println(valor);
        }
    }
}
