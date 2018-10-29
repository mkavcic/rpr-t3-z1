package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj implements TelefonskiBroj{
    private  int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public String ispisi() {
        String c = "";
        c += 0 + mobilnaMreza + "/" + broj;
        return c;
    }

    @Override
    public int hashCode(){
        return mobilnaMreza;
    }

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        else if(o instanceof MobilniBroj){
            MobilniBroj a=(MobilniBroj) o;
            if(a.broj.equals(this.broj) && a.hashCode() == this.hashCode()) return true;
        }
        return false;
    }
}
