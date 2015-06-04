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
 
    public static ArrayList<Prenotazione> listaPrenotazione=new ArrayList<Prenotazione>(); 
    
    public static void confermaPrenotazione(Prenotazione p,Admin a){
    a.confermaPrenotazioneUtente(p,p.idUtente);
    }
     public static void annullaPrenotazione(Prenotazione p){
          GestorePrenotazioni.listaPrenotazione.remove(p);
          DittaAutonoleggio.getInstance().lista.add(p.idAuto);
    
    }
}
