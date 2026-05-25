/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u
 */
public class ejer01 {
    public static void main(String[] args) {
        List <String> lista=new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");

        for(String cad:lista){
            System.out.print(cad+"\t");
        }
    }
}
