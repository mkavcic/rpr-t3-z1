package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {

   abstract String ispisi();

    @Override
    public int compareTo(TelefonskiBroj o) {
        return ispisi().compareTo(o.ispisi());
    }
}
