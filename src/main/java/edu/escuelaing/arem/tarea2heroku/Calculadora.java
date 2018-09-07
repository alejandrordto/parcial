/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.tarea2heroku;

/**
 *clase que imdica la applicacion.
 * @author Alejandro Rodriguez
 */
public class Calculadora {
     private Lista lista;
     public Calculadora(){
        lista= new Lista();
        
     }
   
     public double max(){
         Nodo x=lista.getHead();
         double temp=0;
         boolean flag=false;
         while (x.getSiguiente()!=null){
             if (!flag){
                 temp=x.getValor();
                 flag=true;
             } else{
                 if (temp<x.getValor())temp=x.getValor();
             }
             x=x.getSiguiente();
         }
         if (temp<x.getValor())temp=x.getValor();
        ;
         return temp;
     }
      public double min(){
         Nodo x=lista.getHead();
         double temp=0;
         boolean flag=false;
         while (x.getSiguiente()!=null){
             if (!flag){
                 temp=x.getValor();
                 flag=true;
             } else{
                 if (temp>x.getValor())temp=x.getValor();
             }
             x=x.getSiguiente();
         }
         if (temp>x.getValor())temp=x.getValor();
        ;
         return temp;
     }
      public double suma(){
         Nodo x=lista.getHead();
         double temp=0;
         while (x.getSiguiente()!=null){
            temp+=x.getValor();
            x=x.getSiguiente();
         }
          x=x.getSiguiente();
        ;
         return temp;
     }
     
      public double multiplicacion(){
         Nodo x=lista.getHead();
         double temp=0;
         while (x.getSiguiente()!=null){
            temp*=x.getValor();
            x=x.getSiguiente();
         }
         x=x.getSiguiente();
        ;
         return temp;
     }
     /**
      * funcion usada para leer el fichero dado y obtener la lista
      * @param file direccion del archivo .txt que se leera
      */
     public void leer(String file){
         lista.read(file);
     }

    public Lista getLista() {
        return lista;
    }
  
}