package kincsesladajatek;

import java.util.ArrayList;

public class Jatek {

    private ArrayList<String> ladak;
    private ArrayList<String> feliratok;
//    String[] lada = {"Arany láda: Én rejtem a kicset.Ezüst láda: Nem én rejtem a kincset.Bronz láda: Az arany láda hazudik!"};
    
    public Jatek() {
        ladak = new ArrayList<>();
        feliratok = new ArrayList<>();
    }

    public ArrayList<String> getLadak() {
        return ladak;
    }

    public void setLadak(ArrayList<String> ladak) {
        this.ladak = ladak;
    }

    public ArrayList<String> getFeliratok() {
        return feliratok;
    }

    public void setFeliratok(ArrayList<String> feliratok) {
        this.feliratok = feliratok;
    }
    
    void inditas() {
        System.out.println("Találd ki melyik láda rejti a kincset. Vigyázz, mert a 3 láda közül kettő hazudik és csak az egyik mond igazat!");
//        System.out.println("Arany láda: Én rejtem a kicset.\nEzüst láda: Nem én rejtem a kincset.\nBronz láda: Az arany láda hazudik!");
        listaz();
    }

    @Override
    public String toString() {
        return "Jatek{" + "lada=" + ladak + "felirat=" + feliratok + '}';
    }

    void listaz() {
        System.out.println("lada=" + ladak + "felirat=" + feliratok);
    }
}
