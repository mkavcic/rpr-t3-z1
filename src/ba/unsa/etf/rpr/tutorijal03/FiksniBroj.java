package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj {
    public enum Grad {
        TRAVNIK("030"), ORASJE("031"), ZENICA("032"), SARAJEVO("033"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), BIHAC("037"), GORAZDE("038"), SIROKI_BRIJEG("039"), BRCKO("049"), MRKONJIC_GRAD("050"), BANJA_LUKA("051"), PRIJEDOR("052"), DOBOJ("053"), SAMAC("054"), BIJELJINA("055"), ZVORNIK("056"), PALE("057"), FOCA("058"), TREBINJE("059");

        private final String s;

        Grad(String s) {

            this.s = s;
        }

        @Override
        public String toString() {
            return s;
        }
    }
    private Grad grad;
    private String broj;

    public String ispisi() {
        String c = "";
        int konstanta=0;
        if(grad.ordinal()<10) konstanta =30;
        else if(grad.ordinal()==10) konstanta=40;
        else konstanta=50;
        c += grad + "/" + broj;
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
