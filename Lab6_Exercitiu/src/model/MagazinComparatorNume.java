package model;

import java.util.Comparator;

public class MagazinComparatorNume implements Comparator<Magazin> {
    @Override
    public int compare(Magazin magazin1, Magazin magazin2){
        return magazin1.getNumeMagazin().compareTo(magazin1.getNumeMagazin());
    }
}
