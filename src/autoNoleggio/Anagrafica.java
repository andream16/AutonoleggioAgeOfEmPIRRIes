package autoNoleggio;

import java.util.Observable;




public abstract class Anagrafica extends Observable{
    
    public String nome;
    public String cognome;
    public String email;
    public String codiceFiscale;
   
    
    public Anagrafica( String nome, String cognome, String email, String codiceFiscale){
    this.email=email;
    this.codiceFiscale=codiceFiscale;
    this.nome=nome;
    this.cognome=cognome;
    }
    
    
    
}
