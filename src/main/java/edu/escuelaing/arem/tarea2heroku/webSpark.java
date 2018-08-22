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
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello Heroku");
 }
    static int getPort() {
    if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
    }
	return  4567; 
    }
}
