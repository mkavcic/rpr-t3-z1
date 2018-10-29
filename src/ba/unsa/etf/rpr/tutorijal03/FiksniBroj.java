package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj implements TelefonskiBroj {
    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, BRCKO, MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE
    }
    private Grad grad;
    private String broj;

    public String ispisi() {
        String c = "";
        int konstanta=0;
        if(grad.ordinal()<10) konstanta =30;
        else if(grad.ordinal()==10) konstanta=40;
        else konstanta=50;
        c += "0" + (grad.ordinal()+konstanta) + "/" + broj;
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
