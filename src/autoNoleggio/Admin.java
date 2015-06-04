package autoNoleggio;

import static autoNoleggio.Filiale.parcoAuto;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class Admin extends Anagrafica{

    public Admin(String nome,String cognome,String email, String codiceFiscale) {
        super(nome,cognome,email, codiceFiscale);
    }
    
    public void aggiungiAuto (Auto auto){
       parcoAuto.add(auto);
       }
public void rimuoviAuto(Auto auto){
    parcoAuto.remove(auto);
}
    public static void confermaPrenotazioneUtente(Prenotazione p){
    GestorePrenotazioni.confermaPrenotazione(p);
    };
    
    
    
    public void rimuoviUtente(){};
    
     public boolean verificaStatoAuto(Auto auto){
        return auto.statoAuto.equals("ok");
        }
}
