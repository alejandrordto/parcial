/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.tarea2heroku;
import static spark.Spark.*;
/**
 *
 * @author Alejandro Rodriguez  
 */
public class webSpark {
    private static Calculadora app;
    public static void main(String[] args) {
        
        app=new Calculadora();
        app.leer("test.txt");
        get("/Appesti", (req, res) ->   ("<!DOCTYPE html>"+
                                        "<html>"+
                                        "<head>"+
                                        "<title>Calculador de estadisticos</title>"+
                                        "<meta charset='UTF-8'>"+
                                        "</head>"+
                                        "<body>"+
                                        "<p>Ingrese la lista deseada, separe cada numero con una coma </p>"+
                                        "<div>"+
                                        "<label for='tnum'>Lista de numeros</label>"+
                                        "<input type='text' id='list' name='lista' >"+
                                        "<button id='Butom' class='button' >Calcular</button>"+
                                        "<p>Media: </p>"+ app.getMedia()+
                                        "<p>Descviacion: </p>"+ app.getDesviacion()+
                                        "</div>"+
                                        "</body>"+
                                        "</html>"));
 }
    static int getPort() {
    if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
    }
	return  4567; 
    }
    static String calculo(String value){
        
        return "Media:" +"\n"+"Desviacion estandar:";
    }
}
