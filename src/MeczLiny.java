package src;

public class MeczLiny extends Mecz {
    public MeczLiny(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;



        int sumaS1 = obliczSumeSily(druzyna1);
        int sumaS2 = obliczSumeSily(druzyna2);

        int sumaM1 = obliczSumeMasy(druzyna1);
        int sumaM2 = obliczSumeMasy(druzyna2);
    }
    private int obliczSumeSily(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getSila();
        }
        return suma;
    }

    private int obliczSumeMasy(Druzyna druzyna) {
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getWaga();
        }
        return suma;
    }



    @Override
    public String toString(){
        return super.toString() + druzyna1.nazwaDruzyny + "vs" + druzyna2.nazwaDruzyny
                + "Zwyciezca: " + druzynaWygrana.nazwaDruzyny
                + "Sedzia: " + Sedzia + "\n";
    }


}
