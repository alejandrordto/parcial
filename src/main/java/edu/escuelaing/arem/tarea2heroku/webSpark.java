/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.tarea2heroku;

import spark.*;
import static spark.Spark.*;

/**
 *
 * @author Alejandro Rodriguez
 */
public class webSpark {

    private static Calculadora app;

    public static void main(String[] args) {
        port(getPort());
        app = new Calculadora();
        get("/Appesti", (req, res) -> index(req,res));
        get("/Calculo",(req,res) -> calculo(req,res));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    static String index(Request req, Response res) {
        String web;
        web =  "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action='/Calculo'+>"
                + "  Ingrese los numeros separados por una coma:<br>"
                + "  <input type=\"text\" name='lista'>"
                + "  <br>"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/Calculo\".</p>"
                + "</body>"
                + "</html>";
        return web;
    }

    static String calculo(Request req, Response res) {
        float a;
        float b;
        app.leer(req.queryParams("lista"));
        String charlie;
        charlie="<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                +"<br:>"+"EL numero mayor es:"+app.max()+"<br:>"
                +"<p>"+"El minimo es:"+app.min()+"<p>"
                 +"<p>"+"La sumatoria de los numeros es:"+app.suma()+"<p>"
                 +"<p>"+"La multiplicatoria de los numeros es:"+app.multiplicacion()+"<p>"
                + "</body>"
                + "</html>";
        app=new Calculadora();
        return charlie;
    }
}
