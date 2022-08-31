import java.text.DateFormat;
import java.util.LinkedList;

public class Album {


    private Cena cena;
    private Gatunek gatunek;
    private int rokWydania;

   private LinkedList<Artysta> artysci;

    public LinkedList<Artysta> getArtysci() {
        return artysci;
    }

    public Cena getCena() {
        return cena;
    }

    public void setCena(Cena cena) {
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

    public Album(Cena cena, Gatunek gatunek, int rokWydania) {
        this.cena = cena;
        this.gatunek = gatunek;
        this.rokWydania = rokWydania;
    }

    public void dodajArtyste(Artysta artysta){
        artysci.add(artysta);
    }
    public LinkedList<Artysta> wyswietlListeArtystow() {
        return artysci;
    }


}
