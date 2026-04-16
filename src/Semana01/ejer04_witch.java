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
public class ejer04_witch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char op;
        System.out.println("You wish to: \n[1]Greet\n[2]Say goodbye\n [3]Exit");
        op=sc.next().charAt(0);
        switch (op) {
            case '1':
                System.out.println("Good morning");
                break;
            case '2':
                System.out.println("Bye");
                break;
                case '3':
                System.out.println("See you soon");
                break;
            default:
                System.out.println("Unknown Value");
        
        }
    }
}
