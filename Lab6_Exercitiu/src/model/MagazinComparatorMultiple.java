package model;
import java.util.Comparator;

public class MagazinComparatorMultiple implements Comparator<Magazin> {
    @Override
    public int compare(Magazin magazin1, Magazin magazin2) {
        int comparareNumePropietar = magazin1.getProprietar().getNume().compareTo(magazin2.getProprietar().getNume());
        int compararePrenumePropietar = magazin1.getProprietar().getPrenume().compareTo(magazin2.getProprietar().getPrenume());
        int comparareChiriePlatita = (int) (magazin1.getChirie()-magazin2.getChirie());
        return (comparareNumePropietar == 0)?
                (compararePrenumePropietar == 0) ? comparareChiriePlatita: compararePrenumePropietar
                : comparareNumePropietar;
    }
}

