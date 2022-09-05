import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

class SprzedawcaTest {


    @Test
    public void jakaSumaAlbumowRap() {
        //given
        Album album1 = new Album(100,Gatunek.RAP,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        Album album3 = new Album(200,Gatunek.ROCK,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());

        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.dodajAlbum(album3);
        Sprzedawca sprzedawca = new Sprzedawca();
        sprzedawca.setSklepMuzyczny(sklepMuzyczny);
        long ilosc = sprzedawca.ileAlbumow(Gatunek.RAP);

        //then
        assertEquals(2,  ilosc);
    }

//    @Test
//    public void jakaSumaAlbumowRock() {
//        //given
//        Album album1 = new Album(100,Gatunek.RAP,1990);
//        Album album2 = new Album(200,Gatunek.RAP,2000);
//        Album album3 = new Album(200,Gatunek.ROCK,2000);
//        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//        Sprzedawca sprzedawca = new Sprzedawca();
//        //when
//        sklepMuzyczny.dodajAlbum(album1);
//        sklepMuzyczny.dodajAlbum(album2);
//        sklepMuzyczny.dodajAlbum(album3);
//        int ilosc = sprzedawca.ileAlbumowRap();
//
//        //then
//        assertEquals(1,  ilosc);
//    }
//
//    @Test
//    public void jakaSumaAlbumowPop() {
//        //given
//        Album album1 = new Album(100,Gatunek.RAP,1990);
//        Album album2 = new Album(200,Gatunek.RAP,2000);
//        Album album3 = new Album(200,Gatunek.ROCK,2000);
//        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//        Sprzedawca sprzedawca = new Sprzedawca();
//        //when
//        sklepMuzyczny.dodajAlbum(album1);
//        sklepMuzyczny.dodajAlbum(album2);
//        sklepMuzyczny.dodajAlbum(album3);
//        int ilosc = sprzedawca.ileAlbumowRap();
//
//        //then
//        assertEquals(0,  ilosc);
//    }

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
//    @Test
//    public void jakaSumaAlbumowMiedzyLatami() {
//        //given
//        Album album1 = new Album(100,Gatunek.RAP,1990);
//        Album album2 = new Album(200,Gatunek.RAP,2000);
//        Album album3 = new Album(200,Gatunek.ROCK,2000);
//        Album album4 = new Album(200,Gatunek.ROCK,1960);
//
//        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//        Sprzedawca sprzedawca = new Sprzedawca();
//        //when
//        sklepMuzyczny.dodajAlbum(album1);
//        sklepMuzyczny.dodajAlbum(album2);
//        sklepMuzyczny.dodajAlbum(album3);
//        sklepMuzyczny.dodajAlbum(album4);
//        int ilosc = sprzedawca.sumaAlbumowMiedzyLatami();
//
//        //then
//        assertEquals(0,  ilosc);
//    }


}