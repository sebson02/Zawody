package src;

import java.io.Serializable;

public class MeczSiatkowki extends Mecz implements Serializable {

    public MeczSiatkowki(Sedzia Sedzia, Sedziapom Sedziapom1, Sedziapom Sedziapom2, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.Sedziapom = Sedziapom1;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;

    }
    private int obliczSumeWzrostu(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getWzrost();
        }
        return suma;
    }
}
