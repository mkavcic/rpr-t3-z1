package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;


public class Imenik {
    private HashMap imenikPoImenu, imenikPoBroju;
    public void dodaj(String ime, TelefonskiBroj broj){
        imenikPoBroju.put(broj, ime);
        imenikPoImenu.put(ime, broj);
    }

    public String dajBroj(String ime){
       if(imenikPoImenu.containsKey(ime)){
           TelefonskiBroj telefonskiBroj= (TelefonskiBroj) imenikPoImenu.get(ime);
           return telefonskiBroj.ispisi();
       }
    return null;
    }

    public String dajIme(TelefonskiBroj broj){
        if(imenikPoBroju.containsKey(broj)){
            return (String) imenikPoBroju.get(broj);
        }
        return null;
    }

    public String naSlovo(char s){
        Iterator it=imenikPoImenu.entrySet().iterator();
        while(it.hasNext()){
        
        }
        return null;
    }

   /* public Set<String> izGrada(Grad g){
         Set s[];
         if()

    }*/
}
