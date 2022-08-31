import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class SklepMuzycznyTest {

    @Test
    public void czyIloscAlbumuSieZwiekszyPoDodaniuAlbumu()
    {
        //given
        Album album = new Album(new Cena(100, Waluta.PLN,21, Waluta.EUR),Gatunek.ROCK,1990);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
       //when
        sklepMuzyczny.dodajAlbum(album);

       //then
        assertEquals(1, sklepMuzyczny.getAlbums().size());
    }

    @Test
    public void czyIloscSieZmniejszyPoUsunieciuAlbumu(){
        //given
        Album album1 = new Album(new Cena(100, Waluta.PLN,21, Waluta.EUR),Gatunek.ROCK,1990);
        Album album2 = new Album(new Cena(200, Waluta.EUR,50, Waluta.PLN),Gatunek.RAP,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.usunAlbum(album1);

        //then
        assertEquals(1, sklepMuzyczny.getAlbums().size());

    }
    @Test
    public void czyIloscArtystowWzrasta() {
        //given
        Album album1 = new Album(new Cena(100, Waluta.PLN,21, Waluta.EUR),Gatunek.ROCK,1990);
        Artysta artysta1 = new Artysta("Zenek", "Martyniuk");
        Artysta artysta2 = new Artysta("Dorota", "Rabczewska");

        //when
        album1.dodajArtyste(artysta1);
        album1.dodajArtyste(artysta2);

        //then
        assertEquals(2, album1.getArtysci().size());
    }


//    @Test
//    public void jakaSumaAlbumow() {
//        //given
//        Album album1 = new Album(new Cena(100, Waluta.PLN,21, Waluta.EUR),Gatunek.ROCK,1990);
//        Album album2 = new Album(new Cena(200, Waluta.EUR,50, Waluta.PLN),Gatunek.RAP,2000);
//        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//        Sprzedawca sprzedawca = new Sprzedawca();
//        //when
//        sklepMuzyczny.dodajAlbum(album1);
//        sklepMuzyczny.dodajAlbum(album2);
//        int ilosc = sprzedawca.sumaAlbumowDanegoGatunku(sklepMuzyczny);
//
//        //then
//        assertEquals(2,  ilosc);
//
//    }


}