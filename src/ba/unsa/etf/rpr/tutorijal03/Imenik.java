package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//import java.util.Map;

public class Imenik {
    private HashMap imenikPoImenu, imenikPoBroju;
    public void dodaj(String ime, TelefonskiBroj broj){
        imenikPoBroju.put(broj, ime);
        imenikPoImenu.put(ime, broj);
    }

    /*public String dajBroj(String ime){
        Iterator i=h.entrySet().iterator();
        while(i.hasNext()){
           Set s= (Set) i.next();
        }
    return "";
    }*/

   /* public Set<String> izGrada(Grad g){
         Set s[];
         if()

    }*/
}
