import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class SklepMuzycznyTest {

    @Test
    public void czyIloscAlbumuSieZwiekszyPoDodaniuAlbumu()
    {
        //given
        Album album = new Album(150,Gatunek.ROCK,1990);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
       //when
        sklepMuzyczny.dodajAlbum(album);

       //then
        assertEquals(1, sklepMuzyczny.getAlbums().size());
    }

    @Test
    public void czyIloscSieZmniejszyPoUsunieciuAlbumu(){
        //given
        Album album1 = new Album(100,Gatunek.ROCK,1990);
        Album album2 = new Album(200,Gatunek.RAP,2000);
        SklepMuzyczny sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
        //when
        sklepMuzyczny.dodajAlbum(album1);
        sklepMuzyczny.dodajAlbum(album2);
        sklepMuzyczny.usunAlbum(album1);

        //then
        assertEquals(1, sklepMuzyczny.getAlbums().size());

    }






}