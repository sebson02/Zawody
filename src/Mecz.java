package src;

import java.io.Serializable;
import java.util.Random;
public class Mecz implements Serializable {
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
        druzynaWygrana.nazwaDruzyny = "brak";
    }
    public void UstalWynik(Druzyna druzynaWygrana){
        this.druzynaWygrana = druzynaWygrana;
    }
    public String GetSedziow(){
        return Sedzia.toString();
    }
    @Override
    public String toString(){
        String s = meczID + ".";
        return s;
    }

}
