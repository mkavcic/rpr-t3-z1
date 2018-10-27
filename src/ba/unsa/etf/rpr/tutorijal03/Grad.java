package ba.unsa.etf.rpr.tutorijal03;

public enum Grad {
    TRAVNIK(30), ORASJE(31), ZENICA(32), SARAJEVO(33), LIVNO(34), TUZLA(35), MOSTAR(36), BIHAC(37), GORAZDE(38), SIROKI_BRIJEG(39), BRCKO(49), MRKONJIC_GRAD(50), BANJA_LUKA(51), PRIJEDOR(52), DOBOJ(53), SAMAC(54), BIJELJINA(55), ZVORNIK(56), PALE(57), FOCA(58), TREBINJE(59);
    private int br;

    Grad(int i) {
        this.br = i;
    }
}
