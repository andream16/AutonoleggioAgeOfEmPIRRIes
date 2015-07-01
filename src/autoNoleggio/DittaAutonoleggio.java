package autoNoleggio;

import java.util.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class DittaAutonoleggio {
    private static DittaAutonoleggio ditta;
    
      ParcoAuto parco=new ParcoAuto(); //creo il parco auto
      
       
    private DittaAutonoleggio(){
        
    }
    
    public static DittaAutonoleggio getInstance(){
        if (ditta==null) {
        ditta=new DittaAutonoleggio();    
        } return ditta;
    }
    
    //lista di auto
    
    
   
   
    
    public  ArrayList<AbstractAuto> getLista(){ //passo il parco auto a chi lo richiede
     
    return parco.lista;
    }
       

    
    public void IteratorParcoAuto(){ //scorro il parco auto
        Iterator<AbstractAuto> auto=new AutoIterator();
        auto=parco.lista.iterator();
        int i=1;
        while(auto.hasNext())
        {
            Object element=auto.next();
            if(element instanceof Auto)
            {
                System.out.print(i+" "+element +" \n");
            }
        i++;
        }
    }
    
    public String nome;
    public String sede;
    public Admin admin=new Admin("admin","admin","admiin@admin.it","dmnamdn92r14t354t");


 
}
