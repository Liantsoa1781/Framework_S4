/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Main {
    public static void main(String[] args){
    String url = "http://localhost:8084/SpringMVC/FrontServlet";
    String lol = Utilitaire.getUrl(url);
    System.out.print(lol);
    }
}
