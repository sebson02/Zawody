package src;
import java.io.Serializable;

public class Sedzia implements Serializable{
    private String imie;
    private int skutecznosc;
    private int przychylnosc1;
    private int przychylnsoc2;
    public Sedzia (String imie, int przychylnosc1, int przychylnsoc2, int skutecznosc){
        this.imie = imie;
        this.przychylnosc1 = przychylnosc1;
        this.przychylnsoc2 = przychylnsoc2;
        this.skutecznosc = skutecznosc;
    }
    public void setPrzychylnosc1(int przychylnosc1){
        this.przychylnosc1 = przychylnosc1;
    }
    public void setPrzychylnsoc2(int przychylnsoc2){
        this.przychylnsoc2 = przychylnsoc2;
    }
    public int getPrzychylnosc1(){
        return przychylnosc1;
    }
    public int getPrzychylnosc2(){
        return przychylnsoc2;
    }


}
