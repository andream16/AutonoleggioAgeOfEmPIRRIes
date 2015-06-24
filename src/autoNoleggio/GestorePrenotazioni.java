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
public class GestorePrenotazioni {
 
    public static ArrayList<Prenotazione> listaPrenotazione=new ArrayList<Prenotazione>();//lista delle prenotazioni
    
    
    public static void prenota(Auto auto,Utente u,Filiale f){//prenota una determinata auto in una filiale
        Prenotazione p=new Prenotazione();
        p.setUtente(u);
        p.setAuto(auto);
        aggiungiPrenotazione(p); // aggiungo la prenotazione alla lista
        f.admin.rimuoviAuto(auto);} // rimuovo l'auto dal parco auto
    
    public static void aggiungiPrenotazione(Prenotazione p){ //aggiungo prenotazioni alla lista
    listaPrenotazione.add(p);
    }
     public static void annullaPrenotazione(Prenotazione p){ //rimuovo la prenotazione dalla lista
          GestorePrenotazioni.listaPrenotazione.remove(p);
          DittaAutonoleggio.getInstance().getLista().add(p.idAuto); //aggiungo di nuovo l'auto alla lista
    
    }
}
