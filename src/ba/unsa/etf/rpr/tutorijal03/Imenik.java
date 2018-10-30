package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;


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
        String pocetni="";
        for(Map.Entry<String, TelefonskiBroj> par: imenik.entrySet()){
            String ime=par.getKey();
            String broj=par.getValue().ispisi();
            int i=1;
            if(ime.charAt(0)==s){
                String pomocni=String.format("%d. %s - %s \n", i, ime, broj);
                pocetni+=pomocni;
            }
            i++;
        }
        return pocetni;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> s=new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry: imenik.entrySet()){
            String key=entry.getKey();
            TelefonskiBroj broj=entry.getValue();
            if(broj instanceof FiksniBroj && g.equals(((FiksniBroj) broj).getGrad())) s.add(key);
        }
        return s;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> s=new TreeSet<>();

        return s;
    }
}
