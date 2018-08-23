package edu.escuelaing.arem.tarea2heroku;

/**
 *clase que representa un nodo
 * @author Alejandro Rodriguez
 */
public class Nodo {
    private Nodo siguiente;
    private double valor;
    public Nodo (double valor){
        this.valor=valor;
        this.siguiente=null;
    }
    /**
     * metodo que retorna el nodo asociado
     * @return retorna el nodo asociado a este o nulo en caso de que no exista dicho nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }
    /**
     * indica el valor del nodo
     * @return retorna un numero que representa el valor del nodo
     */
    public double getValor() {
        return valor;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}