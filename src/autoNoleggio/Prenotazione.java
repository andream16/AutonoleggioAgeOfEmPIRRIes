/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoNoleggio;

/**
 *
 * @author Alessio
 */
public class Prenotazione {
    public Utente idUtente;
    public Auto idAuto;
    public int idPrenotazione;
    
    
    public void setAuto(Auto auto){ //specifico quale auto è stata prenotata
        this.idAuto=auto;
    }

    public void setUtente(Utente utente){ //secifico quale utente ha prenotato una determinata auto
        this.idUtente=utente;
    }
}
