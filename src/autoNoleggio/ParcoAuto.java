/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoNoleggio;


import java.util.ArrayList;

/**
 *
 * @author Alessio
 */
public class ParcoAuto {
    
      Auto auto1=new Auto("34dc","corsa",1);
         Auto auto2=new Auto("ad123","206",5);
        
      
       Auto auto3=new Auto("ab64","320d",2);
       Auto auto4=new Auto("ad982","classe a",3);
       Auto auto5=new Auto("ahg243","stilo",4);
       
        public  ArrayList<AbstractAuto> lista= new ArrayList<AbstractAuto>();
    
        public void addAuto(){
        lista.add(auto1);
         lista.add(auto2);
          lista.add(auto3);
           lista.add(auto4);
            lista.add(auto5);
        }
        
    
}
