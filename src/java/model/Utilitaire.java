/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Utilitaire {
    String url = "";
    
    public static String getUrl(String url){
        String separateur = "/";
        String[] spliter = url.split(separateur);
        return spliter[spliter.length-1];
    }
}
