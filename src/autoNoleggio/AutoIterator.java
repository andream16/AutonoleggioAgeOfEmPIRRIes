package autoNoleggio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Alessio
 */
public class AutoIterator implements java.util.Iterator<AbstractAuto>{

    @Override
    public boolean hasNext() {
        if(DittaAutonoleggio.getInstance().getLista().iterator().hasNext())
        {return true;}
                else return false;}
   
        //if Filale.getParcoAuto().hasnext()  getParco è una lista che contiene il parco auto della filiale
    

    @Override
    public AbstractAuto next() {
        Iterator<AbstractAuto> autoitr= DittaAutonoleggio.getInstance().getLista().iterator();
        Object element=autoitr.next();
        if (element instanceof Auto){
            return autoitr.next();
        }
        else return null;
    // return Filiale.getParcoAUto.().next()
    }
    
    
   
}
