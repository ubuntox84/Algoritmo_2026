package Semana01;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u
 */
public class ejer03_If {
    public static void main(String[] args) {
        int a,b,c;
    Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar 3 numeros");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int M=a;
        if(M<b){
            M=b;
        }
        if (M<c){
            M=c;
        }
        System.out.println("the largest number is "+M+" of value :"+a+"-"+b+"-"+c);
    }
    
}
