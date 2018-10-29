package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class Imenik {
    private HashMap <String,TelefonskiBroj>imenikPoImenu = new HashMap<>();
    private HashMap <TelefonskiBroj, String> imenikPoBroju = new HashMap<>();
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

    public Set<String> izGrada(FiksniBroj.Grad g){
        return null;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        return null;
    }
}
