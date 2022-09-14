import java.text.DateFormat;
import java.util.LinkedList;

public class Album {


    private Cena cenaa;
    private double cena;
    private Gatunek gatunek;
    private int rokWydania;
    private Artysta artysta;

    private LinkedList<Artysta> artysci;

    public Album(LinkedList<Artysta> artysci){
        this.artysci = artysci;
    }

    public void setArtysta(Artysta artysta) {
        this.artysta = artysta;
    }

    public Artysta getArtysta() {
        return artysta;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Album(double cena, Gatunek gatunek, int rokWydania) {
        this.cena = cena;
        this.gatunek = gatunek;
        this.rokWydania = rokWydania;
    }

//    public void dodajArtyste() {
//
//
//    }



}
