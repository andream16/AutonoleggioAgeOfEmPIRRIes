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
public class Auto extends AbstractAuto{
    
        public String targa;
        public String modello;
        public int codiceMarca;
        public String statoAuto;
    
    public Auto( String targa, String modello, int codiceMarca){
        
        this.targa=targa;
        this.modello=modello;
        this.codiceMarca=codiceMarca;
        
    }
   
        @Override
    public String toString(){
   return targa+" "+modello+ " "+codiceMarca;     
    }
    
}
