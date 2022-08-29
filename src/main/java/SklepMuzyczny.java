import java.util.Collection;
import java.util.LinkedList;

public class SklepMuzyczny {

    private LinkedList<Album> albumy;

    public SklepMuzyczny(LinkedList<Album> albumy) {
        this.albumy = albumy;
    }

    public void dodajAlbum(Album album){
        albumy.add(album);

    }

    public void usunAlbum(Album album){
        albumy.remove(album);

    }

    public LinkedList<Album> getAlbums() {
        return this.albumy;
    }
}
