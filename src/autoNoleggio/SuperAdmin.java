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
public class SuperAdmin extends Anagrafica{
    

    public SuperAdmin(String nome,String cognome, String email, String codiceFiscale) {
        super(nome,cognome,email,codiceFiscale);
    }
    
    public Filiale deleteFiliale(){ 
        return new Filiale();
    }
    public Filiale aggiungiFIliale(){ 
        return new Filiale();
    }
}
