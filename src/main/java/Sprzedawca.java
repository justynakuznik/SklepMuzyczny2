import java.util.LinkedList;

public class Sprzedawca {

    private SklepMuzyczny sklepMuzyczny;

    public void setSklepMuzyczny(SklepMuzyczny sklepMuzyczny) {
        this.sklepMuzyczny = sklepMuzyczny;
    }
/*
    - ile jest albumów danego gatunku? -> ok
    - jaka jest średnia cena za album?
    - ile albumów wydane między rokiem x a rokiem y?
     */

    //LinkedList<Album> albumy = new LinkedList<Album>();



    public long ileAlbumow(Gatunek gatunek){

        LinkedList<Album> albums = sklepMuzyczny.getAlbums();
        return albums.stream().filter(p -> p.getGatunek().equals(gatunek)).count();

    }

    public int sumaAlbumowMiedzyLatami(SklepMuzyczny sklepMuzyczny, int rokOd, int rokDo) {
        LinkedList<Album> albumy = sklepMuzyczny.getAlbums();
        return (int) albumy
                .stream()
                .filter(album -> (album.getRokWydania() >= rokOd && album.getRokWydania() <= rokDo)).count();
    }

//    public int sumaAlbumowMiedzyLatami(SklepMuzyczny sklepMuzyczny) {
//        LinkedList<Album> albums = sklepMuzyczny.getAlbums();
//        return (int) albums.stream().filter(p -> p.getRokWydania() >= 1990 ).count();
//    }


//    po 1 bym do metody zrzucal liste albumow a nie caly sklep - do metody raczej zrzuca sie niezbedne minimum, pozatym dodatkowe parametry to lata x i y
//    public int sumaAlbumowMiedzyLatami(List<Album> albumy, inte rokOd, int rokDo) {
//
//    }
//9:40
//    po 2 bym pierw przefiltrowal listę w bardzo podobny sposob jak ty ale zrobil polaczone warunki
//9:41
//    public int sumaAlbumowMiedzyLatami(List<Album> albumy, inte rokOd, int rokDo) {
//        return albums
//                .stream()
//                .filter(album -> (album.getRokWydania() >= rokOd && album.getRokWydania() <= rokDo)).count();
//    }
//9:42
//    warunki logiczne mozesz laczyc


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

    //    public int sumaAlbumowMiedzyLatami(LinkedList<Album> albums) {
//        albums = sklepMuzyczny.getAlbums();
//
//        if (albums.get <= 2020 & album.getRokWydania() >=1990) {
//            sklepMuzyczny.dodajAlbum(album);
//        }
//        return sklepMuzyczny.getAlbums().size();
//    }


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

//        public int sredniaCenaAlbumow() {
//        int suma = 0;
//        LinkedList<Cena> ceny = new LinkedList<>();
//        for (int i = 0; i < ceny.size(); i++) {
//            suma += ceny.size();
//        }
//        return suma/ ceny.size();
//    }





//    public int sredniaCenaAlbumow(Album album){
//            albumy.add(album);
//            int sum = 0;
//        return albumy.get().getCena();
//    }










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










}
