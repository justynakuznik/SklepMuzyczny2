import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

class SprzedawcaTest {

    @Test
    public void jakaSumaAlbumow() {
        //given
        Album album1 = new Album(100,Gatunek.ROCK,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        Sprzedawca sprzedawca = new Sprzedawca();
        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        int ilosc = sprzedawca.sumaAlbumowDanegoGatunku();

        //then
        assertEquals(2,  ilosc);
    }
    @Test
    public void jakaSredniaCenaAlbumow() {
        //given
        Album album1 = new Album(100,Gatunek.ROCK,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        Album album3 = new Album(300,Gatunek.RAP,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        Sprzedawca sprzedawca = new Sprzedawca();
        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.dodajAlbum(album3);
        double cena = sprzedawca.sredniaCenaAlbumu();

        //then
        assertEquals(200, cena);
    }

    @Test
    public void jakaSumaAlbumowMiedzyLatami() {
        //given
        Album album1 = new Album(100,Gatunek.ROCK,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        Album album3 = new Album(300,Gatunek.RAP,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        Sprzedawca sprzedawca = new Sprzedawca();
        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.dodajAlbum(album3);
        double suma = sprzedawca.sumaAlbumowMiedzyLatami(sklepMuzyczny.getAlbums().element());

        //then
        assertEquals(3, suma);
    }


}