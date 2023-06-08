package src;
import java.util.Random;

public class MeczLiny extends Mecz {
    public MeczLiny(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;
    }

    @Override
    public String toString(){
        return super.toString() + druzyna1.nazwaDruzyny + "vs" + druzyna2.nazwaDruzyny
                + "Zwyciezca: " + druzynaWygrana.nazwaDruzyny
                + "Sedzia: " + Sedzia + "\n";
    }


}
