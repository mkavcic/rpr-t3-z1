package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj {
    private Grad grad;
    private String broj;

    public String ispisi() {
        String c = "";
        c += 0 + grad.ordinal() + "/" + broj;
        return c;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
}
