package model;

import java.util.Comparator;

public class MagazinComparatorSuprafata implements Comparator<Magazin> {
    @Override
    public int compare(Magazin magazin1, Magazin magazin2){
        return (int) (magazin1.getSuprafata()-magazin2.getSuprafata());
    }
}
