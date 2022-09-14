import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

class SprzedawcaTest {

    @Test
    public void jakaSumaAlbumow() {
        //given
        Album album1 = new Album(100,Gatunek.RAP,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        Album album3 = new Album(200,Gatunek.ROCK,2000);
        Album album4 = new Album(222,Gatunek.POP,1960);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());

        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.dodajAlbum(album3);
        sklepMuzyczny.dodajAlbum(album4);
        Sprzedawca sprzedawca = new Sprzedawca();
        sprzedawca.setSklepMuzyczny(sklepMuzyczny);
        long iloscRap = sprzedawca.ileAlbumow(Gatunek.RAP);
        long iloscPop = sprzedawca.ileAlbumow(Gatunek.POP);
        long iloscRock = sprzedawca.ileAlbumow(Gatunek.ROCK);

        //then
        assertEquals(2,  iloscRap);
        assertEquals(1,  iloscPop);
        assertEquals(1,  iloscRock);
    }



    @Test
    public void jakaSumaAlbumowMiedzyLatami() {
        //given
        Album album1 = new Album(100,Gatunek.RAP,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        Album album3 = new Album(200,Gatunek.ROCK,1995);
        Album album4 = new Album(200,Gatunek.ROCK,1960);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        int x = 1990;
        int y = 2020;

        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.dodajAlbum(album3);
        sklepMuzyczny.dodajAlbum(album4);
        Sprzedawca sprzedawca = new Sprzedawca();
        sprzedawca.setSklepMuzyczny(sklepMuzyczny);
        int ilosc = sprzedawca.sumaAlbumowMiedzyLatami(sklepMuzyczny,x,y);

        //then
        assertEquals(3,  ilosc);
    }


//
//    @Test
//    public void jakaSredniaCenaAlbumow() {
//        //given
//        Album album1 = new Album(100,Gatunek.ROCK,1990);
//        Album album2 = new Album(200,Gatunek.RAP,2000);
//        Album album3 = new Album(300,Gatunek.RAP,2000);
//        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//        Sprzedawca sprzedawca = new Sprzedawca();
//        //when
//        sklepMuzyczny.dodajAlbum(album1);
//        sklepMuzyczny.dodajAlbum(album2);
//        sklepMuzyczny.dodajAlbum(album3);
//        double cena = sprzedawca.sredniaCenaAlbumu();
//
//        //then
//        assertEquals(200, cena);
//    }
//



}