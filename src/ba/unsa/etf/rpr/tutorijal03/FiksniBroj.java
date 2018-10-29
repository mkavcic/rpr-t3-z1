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

    @Override
     public int hashCode(){
        return grad.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        else if(o instanceof FiksniBroj){
            FiksniBroj a=(FiksniBroj) o;
            if(a.broj.equals(this.broj) && a.hashCode() == this.grad.hashCode()) return true;
        }
        return false;
    }
}
