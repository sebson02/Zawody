package src;

import java.util.Random;
public class Mecz {
    public void przeciaganie(Druzyna a, Druzyna b, Sedzia c){
        Random x = new Random();
        int luck1 = x.nextInt(80, 101);
        int luck2 = x.nextInt(80, 101);
        int sumaS1 = 0;
        int sumaS2 = 0;
        int sumaM1 = 0;
        int sumaM2 = 0;
        for (int i=0; i<6; i++){
            sumaS1 += a.getRep(i).getSila();
            sumaM1 += a.getRep(i).getWaga();
            a.getRep(i).zagral();
        }
        for (int j=0; j<6; j++){
            sumaS2 += b.getRep(j).getSila();
            sumaM2 += b.getRep(j).getWaga();
            b.getRep(j).zagral();
        }
        System.out.println("Runda 1");

    }
    public void siatkowka(Druzyna a, Druzyna b, Sedzia c, Sedziapom d, Sedziapom e){

    }
    public void dwaognie(Druzyna a, Druzyna b, Sedzia c){

    }
}
