package autoNoleggio;

import java.util.ArrayList;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class Application {
    public static void main(String[] args){
        
        ArrayList<Utente> utenti=new ArrayList<Utente>();
        DittaAutonoleggio.getInstance().addAuto();
        Filiale filiale=DittaAutonoleggio.getInstance().admin.aggiungiFiliale();
        filiale.admin.addObserver(new ObserverAuto());
        
        boolean flag = true;
        
        while (flag) {
            
            System.out.println("1)Benvenuto: Immetti i tuoi dati: user o admin \n");
            String nome;
            Scanner scan = new Scanner(System.in);
            nome = scan.nextLine();

            if (nome.equals("user")) {
                Utente utente=new Utente("user","user","fhdhf","user@user","visa");
                utenti.add(utente);
                flag = true;
                System.out.println("Cosa vuoi fare? 1) Visualizza Auto  2) Prenota auto3) Cancella prenotazione\n");

                String azione;
                Scanner scanI = new Scanner(System.in);
                azione = scanI.nextLine();
                  if (azione.equals("1")) {
                     
                    DittaAutonoleggio.getInstance().GetIterator();
                  } else if (azione.equals("2")) {
                    
                  
                        System.out.println("Quale auto vuoi prenotare? Scrivi l'indice");
                        DittaAutonoleggio.getInstance().GetIterator();
                        String auto;
                        Scanner scanAuto = new Scanner(System.in);
                        auto = scanAuto.nextLine();
                        int indice=Integer.parseInt(auto);;
                        indice-=1;
                        Prenotazione p=new Prenotazione();
                        p.idUtente=utente;
                      
          
                try{
                    utente.prenota((Auto)DittaAutonoleggio.getInstance().lista.get(indice),p,filiale);
                } catch(Exception e){
                    
                    System.out.println("indice errato");}
                   }
            }
            else if (nome.equals("admin")){
            
             System.out.println("\nCosa vuoi fare? 1) Conferma Prenotazione \n2) Cancella prenotazione \n3) Aggiungi auto  \n4) Rimuovi auto\n");

             String risp;

                Scanner scanRisp = new Scanner(System.in);
                risp = scanRisp.nextLine();

                if (risp.equals("1")) {
                    int i=0;
                    int j=0;
                
                    for(i=0;i<GestorePrenotazioni.listaPrenotazione.size();i++){
                        for(j=0;j<utenti.size();j++){
                            if (GestorePrenotazioni.listaPrenotazione.get(i).idUtente!=utenti.get(j)){
                                j++;} i++;
                        }}
                    if ((GestorePrenotazioni.listaPrenotazione.get(i).idUtente==utenti.get(j))){
                 filiale.admin.confermaPrenotazioneUtente(GestorePrenotazioni.listaPrenotazione.get(i),utenti.get(j));}
                    else System.out.println("Utente non trovato");    
                
                System.out.println("Quale biglietto vuoi acquistare? 1) 90Min 2) 120Min");
                String ticketMin;

                Scanner scanTicket = new Scanner(System.in);
                ticketMin = scanTicket.nextLine();
                
                }
            }
        
        }
    
    }
}

