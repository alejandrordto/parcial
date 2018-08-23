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
        get("/Appesti", (req, res) ->{ 
                String lista= req.queryParams("value");
                return calculo("?value");
                });
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
