package edu.escuelaing.arem.tarea2heroku;


import java.io.*;

/**
 *clase que representa una lista
 * 
 * @author Alejandro rodriguez
 */
public class Lista {
    private Nodo head;
    private Nodo tail;
    private int numeroElementos;
    private String txt="";
    
    public Lista(){
        head=null;
        numeroElementos=0;
    }
    /**
    * Añade un elemento a la lista
    *@param numero representa el valor que se va agregar en la lista(un numero en este caso)
    */
    public void add(double numero){
        numeroElementos++;
        if (head==null){
            head= new Nodo(numero);
            tail=head;
        } else{
            Nodo Temp= new Nodo(numero);
            tail.setSiguiente(Temp);
            tail=Temp;
        }
    }
    /**
     * funcion que regresa el primer elemnto agregado
     * @return devuelve el primer elemento de la lista 
     */
    public Nodo getHead() {
        return head;
    }
    /**
     * indica la cantidad de elementos en la lista
     * @return cantidad de elementos en la lista
     */
    public int getNumeroElementos() {
        return numeroElementos;
    }
    /**
     * lee el archivo y mete los elementos de este en la lista, cada numero esta en una linea diferente
     * @param file direccion del arciovo a leer
     */
    public void leer(String file){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String bfRead;
            while ((bfRead=bf.readLine()) != null){
                this.add(Double.parseDouble(bfRead));
            }
        } catch (Exception e){
            System.err.println("No se encontro el archivo ");
        }
    }

    @Override
    public String toString() {
         Nodo temp=head;
         while (temp.getSiguiente()!= null){
            txt=txt+temp.getValor();
            temp=temp.getSiguiente();
         }
        return txt;
    }
    
}
