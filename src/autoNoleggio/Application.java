package autoNoleggio;

import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class Application {
    public static void main(String[] args){
        Filiale filiale1= new Filiale();
        //inserisci nome.cognome,codF,e carta di credito
        // se utente=admin
        filiale1.admin=new Admin("admin","admin","fsdjfj","ds");
        // se no
        Utente utente=new Utente("MArio","Pesce","123124124123","miao","visa");
  //menu      
        //vuoi visualizzare auto?
        //si
        //vuoi prenotare un'auto?
        //si
      
        Auto auto1=new Auto("34dc","corsa",1);
         Auto auto2=new Auto("ad123","opel",1);
        
      
       Auto auto3=new Auto("ab64","bmw",2);
       Auto auto4=new Auto("ad982","mercedes",3);
       Auto auto5=new Auto("ahg243","fiat",4);
       
       filiale1.admin.aggiungiAuto(auto1);
        filiale1.admin.aggiungiAuto(auto2); 
         filiale1.admin.aggiungiAuto(auto3);
          filiale1.admin.aggiungiAuto(auto4);
          filiale1.admin.aggiungiAuto(auto5);
        
        
       System.out.println(auto1.toString());
       Prenotazione p=new Prenotazione();
       Prenotazione p1=new Prenotazione();
        utente.prenota(auto1,p);
        utente.prenota(auto2,p1);
        utente.cancellaPrenotazione(p);
        
        
    }
    
}
