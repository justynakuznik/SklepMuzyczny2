import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    @Test
    public void czyIloscArtystowWzrasta() {
        //given
        Album album1 = new Album(100,Gatunek.ROCK,1990);
        Artysta artysta1 = new Artysta("Zenek", "Martyniuk");
        Artysta artysta2 = new Artysta("Dorota", "Rabczewska");

        //when
        album1.dodajArtyste(artysta1);
        album1.dodajArtyste(artysta2);

        //then
        assertEquals(2, album1.getArtysci().size());
    }

}