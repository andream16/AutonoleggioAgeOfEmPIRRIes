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
public class Admin extends Anagrafica{

    public Admin(String nome,String cognome,String email, String codiceFiscale) {
        super(nome,cognome,email, codiceFiscale);
    }
    
    
        
    
     public Filiale deleteFiliale(){ //elimino filiale
        return new Filiale();
    } 
    public Filiale aggiungiFiliale(){ //aggiungo filiale
        Filiale filiale=new Filiale();
        filiale.admin=new Admin("admin","admin","fsdjfj","ds");
        
       
        return filiale;}
    
    
    public void rimuoviUtente(){ //rimuove l'utente dalla lista di utenti
    
    };
    
     public boolean verificaStatoAuto(Auto auto){
         
        return auto.statoAuto.equals("ok");
     }
}
