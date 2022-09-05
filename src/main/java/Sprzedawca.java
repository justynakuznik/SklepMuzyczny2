import java.util.LinkedList;

public class Sprzedawca {

    private int x = 1990;
    private int y = 2020;
    private SklepMuzyczny sklepMuzyczny;

    public void setSklepMuzyczny(SklepMuzyczny sklepMuzyczny) {
        this.sklepMuzyczny = sklepMuzyczny;
    }
/*
    - ile jest albumów danego gatunku?
    - jaka jest średnia cena za album?
    - ile albumów wydane między rokiem x a rokiem y?
     */

    //LinkedList<Album> albumy = new LinkedList<Album>();



    public long ileAlbumow(Gatunek gatunek){

        LinkedList<Album> albums = sklepMuzyczny.getAlbums();
        return albums.stream().filter(p -> p.getGatunek().equals(gatunek)).count();



    }




//    public int sredniaCenaAlbumow(Album album){
//            albumy.add(album);
//            int sum = 0;
//        return albumy.get().getCena();
//    }

//    public int sumaAlbumowMiedzyLatami() {
//
//        if (album.getRokWydania() <= 2020 & album.getRokWydania() >=1990) {
//            sklepMuzyczny.dodajAlbum(album);
//        }
//        return sklepMuzyczny.getAlbums().size();
//    }




//    public int sumaAlbumowDanegoGatunku(){
//        int sum = 0;
//        for(int i = 0; i < albumy.size(); i++)
//        {
//            sum = sum + albumy.get(i);
//        }
//        return sum;
//    }



    LinkedList<Double> cena = new LinkedList<>();
    public double sredniaCenaAlbumu(){
        double sum = 0;
        for(int i = 0; i < cena.size(); i++)
        {
            sum = sum + cena.get(i);
        }
        return sum/ cena.size();
    }



//    public int sumaAlbumowMiedzyLatami(Album album) {
//
//        if (album.getRokWydania() <= 2020) {
//            int sum = 0;
//            for (int i = 0; i < albumy.size(); i++) {
//                sum = sum + albumy.get(i);
//            }
//            return sum;
//        }
//        else return 0;
//    }

//    LinkedList<Album> albumy = new LinkedList<>();
//
//    public int sumaAlbumow() {
//        int suma = 0;
//        //if (albumy.getGatunek() = Gatunek.RAP) {
//            for (int i = 0; i < albumy.size(); i++) {
//                suma = suma + albumy.get(i);
//            }
//
//
//        //}
//        return suma;
//    }
//
//
//    public int sredniaCenaAlbumow() {
//        int suma = 0;
//        LinkedList<Cena> ceny = new LinkedList<>();
//        for (int i = 0; i < ceny.size(); i++) {
//            suma += ceny.size();
//        }
//        return suma/ ceny.size();
//    }
//
//    LinkedList<Double> cena = new LinkedList<>();
//    public double sredniaCenaAlbumu(){
//        double sum = 0;
//        for(int i = 0; i < cena.size(); i++)
//        {
//            sum = sum + cena.get(i);
//        }
//        return sum/ cena.size();
//    }
//
//
//
//    public int sumaAlbumowMiedzyLatami(Album album) {
//
//        if (album.getRokWydania() <= 2020) {
//            int sum = 0;
//            for (int i = 0; i < albumy.size(); i++) {
//                sum = sum + albumy.get(i);
//            }
//            return sum;
//        }
//        else return 0;
//    }









}
