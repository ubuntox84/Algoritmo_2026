/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana08;

/**
 *
 * @author u
 */
class nodo{
    int dato;
    nodo sgte;
    public nodo(int x){
        this.dato=x;
        this.sgte=null;
    }
}
class operacion{
    nodo cabeza;
    nodo cola;
    public operacion(){
        this.cabeza=this.cola=null;
    }
    void agregarInicio(int x){
        nodo newnodo=new nodo(x);
        if(cabeza==null && cola==null){
            cabeza=cola=newnodo;
        }else{
            cabeza.sgte=newnodo;
            cabeza=newnodo;
        }
    }
    void agregarFinal(int x){
        nodo newnodo=new nodo(x);
        if(cabeza==null && cola==null){
            cabeza=cola=newnodo;
        }else{
            newnodo.sgte=cola;
            cola=newnodo;
        }
    }
    void recorrerCola(){
        nodo temp=cola;
        while(temp!=null){
            System.out.print(temp.dato+"\t");
            temp=temp.sgte;
        }
    }
}
public class ejer02 {
    public static void main(String[] args) {
        operacion lista=new operacion();
        lista.agregarInicio(15);
        lista.agregarInicio(8);
        lista.agregarFinal(14);
        lista.agregarInicio(4);
        lista.agregarInicio(3);        
        lista.agregarFinal(22);
        lista.recorrerCola();
    }
}
