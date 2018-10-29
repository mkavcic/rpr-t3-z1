package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj implements TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
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
