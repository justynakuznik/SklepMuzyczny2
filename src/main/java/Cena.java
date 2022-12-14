public class Cena {

    private double cenaPln;
    private double cenaEur;
    private Waluta walutaPln;
    private Waluta walutaEur;

    public double getCenaPln() {
        return cenaPln;
    }

    public void setCenaPln(double cenaPln) {
        this.cenaPln = cenaPln;
    }

    public double getCenaEur() {
        return cenaEur;
    }

    public void setCenaEur(double cenaEur) {
        this.cenaEur = cenaEur;
    }

    public Waluta getWalutaPln() {
        return walutaPln;
    }

    public void setWalutaPln(Waluta walutaPln) {
        this.walutaPln = walutaPln;
    }

    public Waluta getWalutaEur() {
        return walutaEur;
    }

    public void setWalutaEur(Waluta walutaEur) {
        this.walutaEur = walutaEur;
    }

    public Cena(double cenaPln, Waluta walutaPln, double cenaEur, Waluta walutaEur) {
        this.cenaPln = cenaPln;
        this.walutaPln = walutaPln;
        this.cenaEur = cenaEur;
        this.walutaEur = walutaEur;
    }

    public Cena(double cenaPln) {
        this.cenaPln = cenaPln;
    }

}
