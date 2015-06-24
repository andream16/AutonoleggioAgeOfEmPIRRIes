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
    
    public void aggiungiAuto (Auto auto){ //aggiungo auto al parco auto
        DittaAutonoleggio.getInstance().getLista().add(auto);
      
    }
        
    public AbstractAuto rimuoviAuto(Auto auto){ //rimuovo auto dal parco auto
    try{
        Auto index=auto;
        int i=0;
        
            while(index!=DittaAutonoleggio.getInstance().getLista().get(i)){
                
                i++;
            }
            
                    AbstractAuto auto1=DittaAutonoleggio.getInstance().getLista().get(i);
                    DittaAutonoleggio.getInstance().getLista().remove(auto1);
                    setChanged(); //notifico lo stato del parco auto e nel caso stampo un messaggio
    
                    notifyObservers(DittaAutonoleggio.getInstance().getLista().size());
       
     return index;
     
    } catch (Exception e){
        
                System.out.println("Le macchine sono state tutte prenotate");
                
            return null;
   
            }
    }
     public Filiale deleteFiliale(){ //elimino filiale
        return new Filiale();
    } 
    public Filiale aggiungiFiliale(){ //aggiungo filiale
        Filiale filiale=new Filiale();
        filiale.admin=new Admin("admin","admin","fsdjfj","ds");
        filiale.admin.addObserver(new ObserverAuto()); 
       
        return filiale;}
    
    
    public void rimuoviUtente(){ //rimuove l'utente dalla lista di utenti
    
    };
    
     public boolean verificaStatoAuto(Auto auto){
         
        return auto.statoAuto.equals("ok");
     }
}
