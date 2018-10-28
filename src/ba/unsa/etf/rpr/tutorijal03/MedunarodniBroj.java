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
}
