import java.util.LinkedList;

public class Sprzedawca {

    private int x = 1990;
    private int y = 2020;

    /*
    - ile jest albumów danego gatunku?
    - jaka jest średnia cena za album?
    - ile albumów wydane między rokiem x a rokiem y?
     */

    LinkedList<Integer> albumy = new LinkedList<>();
    public int sumaAlbumowDanegoGatunku(){
        int sum = 0;
        for(int i = 0; i < albumy.size(); i++)
        {
            sum = sum + albumy.get(i);
        }
        return sum;
    }

    LinkedList<Double> cena = new LinkedList<>();
    public double sredniaCenaAlbumu(){
        double sum = 0;
        for(int i = 0; i < cena.size(); i++)
        {
            sum = sum + cena.get(i);
        }
        return sum/ cena.size();
    }

    public int sumaAlbumowMiedzyLatami(Album album) {

        if (album.getRokWydania() <= 2020) {
            int sum = 0;
            for (int i = 0; i < albumy.size(); i++) {
                sum = sum + albumy.get(i);
            }
            return sum;
        }
        else return 0;
    }


}
