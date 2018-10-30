package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String c="+"+drzava+broj;
        return c;
    }

    @Override
    public int hashCode(){
        return drzava.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        else if(o instanceof MedunarodniBroj){
            MedunarodniBroj a=(MedunarodniBroj) o;
            if(a.broj.equals(this.broj) && a.hashCode() == this.drzava.hashCode()) return true;
        }
        return false;
    }
}
