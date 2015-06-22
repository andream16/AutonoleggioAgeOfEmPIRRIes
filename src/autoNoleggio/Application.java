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
        
        ArrayList<Utente> utenti=new ArrayList<Utente>(); //lista di utenti registrati
        
        Filiale filiale=DittaAutonoleggio.getInstance().admin.aggiungiFiliale(); //filiale di riferimento//
        
        DittaAutonoleggio.getInstance().addAuto(); //inizializzazione parco auto//
        
        
        boolean flag = true;
        
        while (flag) {
            
            System.out.println("1)Benvenuto: Immetti i tuoi dati: user o admin \n"); //controllo tipo di persona che accede
            String nome;
            Scanner scan = new Scanner(System.in);
            nome = scan.nextLine();

            if (nome.equals("user")) {
                Utente utente=new Utente("user","user","fhdhf","user@user","visa");
                utenti.add(utente); //aggiunta dell'utente nella lista di utenti
                flag = true;
                System.out.println("Cosa vuoi fare? 1) Visualizza Auto  2) Prenota auto3) Cancella prenotazione\n");

                String azione;
                Scanner scanI = new Scanner(System.in);
                azione = scanI.nextLine();
                  if (azione.equals("1")) { //stampo a video il parco auto
                     
                    DittaAutonoleggio.getInstance().GetIterator();
                  } else if (azione.equals("2")) {
                    
                  
                        System.out.println("Quale auto vuoi prenotare? Scrivi l'indice");
                        DittaAutonoleggio.getInstance().GetIterator(); /*stampo il parco auto per far decidere all'utente 
                        quale auto prenotare*/
                        String auto;
                        Scanner scanAuto = new Scanner(System.in);
                        auto = scanAuto.nextLine();
                        int indice=Integer.parseInt(auto);;
                        indice-=1;
                        Prenotazione p=new Prenotazione();
                        p.idUtente=utente; // setto l'utente come quello che ha prenotato una determinata auto
                        GestorePrenotazioni.listaPrenotazione.add(p); //aggiungo la prenotazione alla lista delle prneotazioni//
                      
          
                try{ //provo a rimuovere un'auto dal parco dopo aver richiesto la prenotazione
                    utente.prenota((Auto)DittaAutonoleggio.getInstance().lista.get(indice),p,filiale);
                } catch(Exception e){
                    
                    System.out.println("indice errato");}
                   }
            }
            else if (nome.equals("admin")){
            
             System.out.println("\n1)Aggiungi auto  \n2) Rimuovi auto\n");

             String risp;

                Scanner scanRisp = new Scanner(System.in);
                risp = scanRisp.nextLine();

                if (risp.equals("1")) { //aggiungo auto al parco auto
               
                    DittaAutonoleggio.getInstance().admin.aggiungiAuto(new Auto("1eu2","corsa",2));
               
                }
                
                if (risp.equals("2")) {  //rimuovo l'auto selezionata
               System.out.println("Quale auto vuoi rimuovere? Scrivi l'indice");
                        DittaAutonoleggio.getInstance().GetIterator();
                        String auto;
                        Scanner scanAuto = new Scanner(System.in);
                        auto = scanAuto.nextLine();
                        int indice=Integer.parseInt(auto);;
                        indice-=1;
                    DittaAutonoleggio.getInstance().admin.rimuoviAuto((Auto)DittaAutonoleggio.getInstance().lista.get(indice));
               flag=false;
                }
                
            }
        
        }
    
    }
}

