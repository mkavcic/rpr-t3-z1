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
}
