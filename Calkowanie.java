import java.util.ArrayList;
import java.util.List;

public class Calkowanie {
    final private double poczatek_calkowanie;
    final private double koniec_calkowania;
    List<M_prostokatow> watki = new ArrayList<>();
    List<M_trapezow> watki2 = new ArrayList<>();
    List<M_simpsona> watki3 = new ArrayList<>();

    public Calkowanie(double poczatek_calkowanie, double koniec_calkowania) {
        this.poczatek_calkowanie = poczatek_calkowanie;
        this.koniec_calkowania = koniec_calkowania;

    }

    public double policz() {

        int n = 100; //ilość odcinków
        double podstawka = (koniec_calkowania - poczatek_calkowanie) / n;
        for (int x = 0; x < n; x++) {
            if (x == 0) {
                watki.add(new M_prostokatow(poczatek_calkowanie, poczatek_calkowanie + podstawka));
                watki2.add(new M_trapezow(poczatek_calkowanie,poczatek_calkowanie+podstawka));
                watki3.add(new M_simpsona(poczatek_calkowanie,poczatek_calkowanie+podstawka));
            } else {
                watki.add(new M_prostokatow(poczatek_calkowanie + x * podstawka, poczatek_calkowanie + (x + 1) * podstawka));
                watki2.add(new M_trapezow(poczatek_calkowanie + x * podstawka, poczatek_calkowanie + (x + 1) * podstawka));
                watki3.add(new M_simpsona(poczatek_calkowanie,poczatek_calkowanie+podstawka));
            }
        }

        for (int x = 0; x < watki.size(); x++) {
            watki.get(x).start();
            watki2.get(x).start();
            watki3.get(x).start();
            try {
                watki.get(x).join();
                watki2.get(x).join();
                watki3.get(x).join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double suma = 0;
        double suma2 = 0;
        double suma3=0;
        for (int x = 0; x < watki.size(); x++) {
            suma += watki.get(x).getPole();
            suma2+=watki2.get(x).getPole();
            suma3+=watki3.get(x).getPole();

        }
        System.out.println(suma3);
        System.out.println(suma2);
        return suma;
    }


}
