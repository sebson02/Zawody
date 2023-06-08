package src;

import java.util.ArrayList;
public class Druzyna {
    private ArrayList<Zawodnik> zawodnicy = new ArrayList<Zawodnik>();
    private ArrayList<Zawodnik> reprezentacja = new ArrayList<Zawodnik>();
    private int iloscZawodnikow = 0;
    private int iloscRep = 0;
    private int punkty = 0;
    private int saldo = 2000;
    private String nazwa = "cegła team";

    public Druzyna(String nazwa){
        this.nazwa = nazwa;
    }
    public void dodajpunkty(int a){
        punkty += a;
    }
    public void dodajZawodnika(Zawodnik a){
        if (iloscZawodnikow < 10){
            zawodnicy.add(a);
            iloscZawodnikow += 1;
        }
        else System.out.println("Drużyna ma maksymalną ilość zawodników");
    }
    void dodajDoRep(int a){
        if (a<6){
            if (zawodnicy.get(a).getZmeczenie() > 20) {
                reprezentacja.add(zawodnicy.get(a));
            }
        }
    }
    void usunZRep(int a){
        if (a<6 && a>-1){
            reprezentacja.remove(a);
        }
        else System.out.println("Błąd");
    }
    public Zawodnik getZawodnik(int a){
        return zawodnicy.get(a);
    }
    public Zawodnik getRep(int a){
        return reprezentacja.get(a);
    }
    public void wplac(int a){
        saldo += a;
    }
    public void wyplac(int a){
        if (saldo > a) {
            saldo -= a;
        }
        else System.out.println("Za mało pieniędzy na koncie!");
    }
}
