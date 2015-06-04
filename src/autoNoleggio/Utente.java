package autoNoleggio;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class Utente extends Anagrafica{
    
    String carta;
    
    public Utente(String nome, String cognome, String email, String codiceFiscale,String carta) {
        super(nome, cognome,email, codiceFiscale);
        this.carta=carta;
    }
    
    public void prenota(Auto auto,Prenotazione p){
        p.setUtente(this);
        p.setAuto(auto);
       Admin.confermaPrenotazioneUtente(p);
    }
    public void cancellaPrenotazione(Prenotazione p){
        GestorePrenotazioni.annullaPrenotazione(p);
    }
    
    public void visualizzaParcoAuto(){
    
    };
    
    public void assistenza(){
    
    };
    
    public void modificaProfilo(){
    
    };
    
    public void restituzioneAuto(){
      
    };
    
}
