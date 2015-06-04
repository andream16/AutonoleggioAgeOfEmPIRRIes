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
    
        Auto auto1=new Auto("34dc","corsa",1);
         Auto auto2=new Auto("ad123","206",5);
        
      
       Auto auto3=new Auto("ab64","320d",2);
       Auto auto4=new Auto("ad982","classe a",3);
       Auto auto5=new Auto("ahg243","stilo",4);
       
    private DittaAutonoleggio(){
        
    }
    
    public static DittaAutonoleggio getInstance(){
        if (ditta==null) {
        ditta=new DittaAutonoleggio();    
        } return ditta;
    }
    
    public ArrayList<AbstractAuto> lista= new ArrayList<AbstractAuto>();
    
    
   
   
    
    public void addAuto(){
    lista.add(auto1);
    lista.add(auto2);
    lista.add(auto3);
    lista.add(auto4);
    lista.add(auto5);
    
    }
       

    
    public void GetIterator(){
        Iterator<AbstractAuto> auto=new AutoIterator();
        auto=lista.iterator();
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
    public SuperAdmin admin=new SuperAdmin("Super","Admin","gli928znchee89354b","superadmin@admin.it");
    
 
}
