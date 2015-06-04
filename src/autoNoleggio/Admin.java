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
    
    public void aggiungiAuto (Auto auto){
        DittaAutonoleggio.getInstance().lista.add(auto);
      
    }
        
    public AbstractAuto rimuoviAuto(Auto auto){
    try{
        Auto index=auto;
        int i=0;
        
            while(index!=DittaAutonoleggio.getInstance().lista.get(i)){
                
                i++;
            }
            
                    AbstractAuto auto1=DittaAutonoleggio.getInstance().lista.get(i);
                    DittaAutonoleggio.getInstance().lista.remove(auto1);
                    setChanged();
    
                    notifyObservers(DittaAutonoleggio.getInstance().lista.size());
       
     return index;
     
    } catch (Exception e){
        
                System.out.println("Le macchine sono state tutte prenotate");
                
            return null;
   
            }
    }
    public  void confermaPrenotazioneUtente(Prenotazione p,Utente u){
        
        if (u.carta!=null){
        
            GestorePrenotazioni.listaPrenotazione.add(p);
            rimuoviAuto(p.idAuto);
            System.out.println(p.idAuto.toString()+" è stata rimossa");

        } else System.out.println("Impossibile effettuare il pagamento"); 
    } 
    
    
    public void rimuoviUtente(){
    
    };
    
     public boolean verificaStatoAuto(Auto auto){
         
        return auto.statoAuto.equals("ok");
     }
}
