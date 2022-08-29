import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Artysta> artysci = new LinkedList<>();

        Artysta artysta1 = new Artysta("Dawid", "Podsiadło");
        Artysta artysta2 = new Artysta("Freddie", "Mercury");
        Artysta artysta3 = new Artysta("Brian", "May");
        Artysta artysta4 = new Artysta("Roger", "Taylor");
        Artysta artysta5 = new Artysta("Michał", "Matczak");

        artysci.add(artysta1);
        artysci.add(artysta2);
        artysci.add(artysta3);
        artysci.add(artysta4);
        artysci.add(artysta5);

        LinkedList<Album> albumy = new LinkedList<>();

        Album rockAlbum = new Album(new Cena(100, Waluta.PLN,21, Waluta.EUR),Gatunek.ROCK,1990);
        rockAlbum.dodajArtyste(artysta2);
        rockAlbum.dodajArtyste(artysta3);
        rockAlbum.dodajArtyste(artysta4);

        Album popAlbum = new Album(new Cena(200, Waluta.PLN,42, Waluta.EUR),Gatunek.POP,2020);
        rockAlbum.dodajArtyste(artysta1);

        Album rapAlbum = new Album(new Cena(50, Waluta.PLN,10, Waluta.EUR),Gatunek.RAP,2022);
        rockAlbum.dodajArtyste(artysta5);


        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(albumy);
        sklepMuzyczny.dodajAlbum(rockAlbum);
        sklepMuzyczny.dodajAlbum(popAlbum);
        sklepMuzyczny.dodajAlbum(rapAlbum);

        sklepMuzyczny.usunAlbum(popAlbum);

        Sprzedawca sprzedawca = new Sprzedawca();














    }
}
