/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoNoleggio;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alessio
 */
public class ApplicationTest {
    
    public ApplicationTest() {
    }
    Filiale filiale=DittaAutonoleggio.getInstance().admin.aggiungiFiliale();
       Auto auto= new Auto("dad","zonda",1);
       Prenotazione p=new Prenotazione();
    

    /**
     * Test of main method, of class Application.
     */
    @Test
    public void testAggiuntaAuto() {
       
       DittaAutonoleggio.getInstance().parco.aggiungiAuto(auto);
       Assert.assertEquals(1, DittaAutonoleggio.getInstance().getLista().size());
       
       
    }
    
    
   
    
    @Test
    public void TestPrenotazione(){
    
    
    Utente utente=new Utente("mario","rossi","mario@rossi","fjsfjsd2r39r","visa");
  GestorePrenotazioni.prenota(auto, utente, filiale);
    
   Assert.assertEquals(0, DittaAutonoleggio.getInstance().getLista().size());
    
    
        
    }
    
    
    
}
