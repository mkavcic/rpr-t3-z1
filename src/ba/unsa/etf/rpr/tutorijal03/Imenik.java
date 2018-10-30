package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;



public class Imenik {
    private HashMap <String,TelefonskiBroj> imenik= new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime){
       if(imenik.containsKey(ime)){
           TelefonskiBroj telefonskiBroj= (TelefonskiBroj) imenik.get(ime);
           return telefonskiBroj.ispisi();
       }
    return null;
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> par: imenik.entrySet()){
            if(par.getValue()==broj) return par.getKey();
        }
        return null;
    }

    public String naSlovo(char s){
        for(Map.Entry<String, TelefonskiBroj> par: imenik.entrySet()){
            String ime=(String) par.getKey();
            String broj=par.getValue().ispisi();
            String pocetni="";
            int i=0;
            if(ime.charAt(0)==s){
                String pomocni=String.format("%d. %s/%s-%s \n", i, ime, broj);
                pocetni+=pomocni;
            }
            i++;
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
