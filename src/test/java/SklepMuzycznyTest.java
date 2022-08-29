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

}