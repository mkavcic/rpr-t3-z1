package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj {
    public enum Grad {
        TRAVNIK(30), ORASJE(31), ZENICA(32), SARAJEVO(33), LIVNO(34), TUZLA(35), MOSTAR(36), BIHAC(37), GORAZDE(38), SIROKI_BRIJEG(39), BRCKO(49), MRKONJIC_GRAD(50), BANJA_LUKA(51), PRIJEDOR(52), DOBOJ(53), SAMAC(54), BIJELJINA(55), ZVORNIK(56), PALE(57), FOCA(58), TREBINJE(59);
        private int br;

        Grad(int i) {
            this.br = i;
        }
    }
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
