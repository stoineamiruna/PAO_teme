package model;

import java.util.Comparator;

public class MagazinComparatorVenit implements Comparator<Magazin> {
    @Override
    public int compare(Magazin magazin1, Magazin magazin2){
        return (int) (magazin1.getVenit()-magazin2.getVenit());
    }
}
