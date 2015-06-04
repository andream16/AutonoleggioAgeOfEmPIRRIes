package autoNoleggio;




public abstract class Anagrafica {
    
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
