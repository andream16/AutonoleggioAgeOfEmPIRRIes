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
public class ObserverAuto implements Observer{

    
    ArrayList<Observer> obList=new ArrayList<Observer>();
    @Override
    public String toString(){
    return "Auto";
    }
    @Override
    public void update(Observable o, Object arg) {
        
       if(arg!=null){
           int num=(int) arg;
           if(num==0)
               System.out.println("Le macchine sono terminate");
       }
        
    }
    
    
    
}
