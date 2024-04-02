package model;
import java.util.Comparator;

public class MagazinComparatorChirie implements Comparator<Magazin> {
    @Override
    public int compare(Magazin magazin1, Magazin magazin2){
        return (int) (magazin1.getChirie()-magazin2.getChirie());
    }
}
