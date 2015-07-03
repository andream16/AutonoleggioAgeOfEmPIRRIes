/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoNoleggio;

import java.util.ArrayList;

/**
 *
 * @author Alessio
 */
public class GestoreFiliali {
    
    public static ArrayList<Filiale> filiali=new ArrayList<Filiale>();
    
     public static void deleteFiliale(Filiale f){ //elimino filiale
        filiali.remove(f);
    } 
    public static Filiale aggiungiFiliale(String nome, String sede, Admin admin){ //aggiungo filiale
        Filiale filiale=new Filiale(nome,sede,admin);
        filiali.add(filiale);
           return filiale;}
    
    
}
