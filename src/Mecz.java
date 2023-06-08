package src;

import java.util.Random;
public class Mecz {
    public Druzyna druzyna1;
    public Druzyna druzyna2;
    public Sedzia Sedzia;
    public Sedziapom Sedziapom;
    public Druzyna druzynaWygrana;
    public int meczID;
    public static int currentID = 1;

    public Mecz(){
        meczID = currentID;
        currentID += 1;
        this.druzynaWygrana = new Druzyna();

    }


}
