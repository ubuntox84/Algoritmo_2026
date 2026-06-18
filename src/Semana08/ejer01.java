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
class operaciones{
    nodo head;
    public operaciones(){
        this.head=null;
    }
    void agregar(int x){
        nodo newnodo=new nodo(x);
        if(head==null){
            head=newnodo;
        }else{
            newnodo.sgte=head;
            head=newnodo;
        }
    }
    void recorrer(){
        nodo temp=head;
        while(temp!=null){
            System.out.print(temp.dato+"\t");
            temp=temp.sgte;
        }
    }
    boolean buscar(int x){
        nodo temp=head;
        boolean band=false;
        while(temp!=null){
            if(temp.dato==x){
                band=true;
                return band;                
            }
            temp=temp.sgte;
        }
        return band;
    }
    boolean eliminar(int x){
        nodo temp=head;
        if(buscar(x)){
            if(head.dato==x){
                head=head.sgte;
            }else{
                while(temp!=null){
                    if(temp.sgte.dato==x){
                        temp.sgte=temp.sgte.sgte;
                        break;
                    }
                    temp=temp.sgte;
                }
            }
            return true;
        }else
            return false;
    }
}

public class ejer01 {
    public static void main(String[] args) {
        operaciones lista = new operaciones();
        lista.agregar(30);
        lista.agregar(20);
        lista.agregar(10);
        lista.agregar(0);
        lista.agregar(40);
        lista.recorrer();
        
        if(lista.eliminar(20))
            System.out.println("\nSe elimino");
        else
            System.out.println("\nNo se elimino!!");
        
        lista.recorrer();
        
        
        //1 motrar
        //2 agregar
        //3 buscar
        //4 eliminar
    }
}
