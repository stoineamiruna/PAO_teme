package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoppingMall{
    private List<Magazin> magazine = new ArrayList<>();

    public List<Magazin> getMagazine() {
        return magazine;
    }

    public void addMagazin(Magazin magazin){
        magazine.add(magazin);
        System.out.println("Magazinul "+magazin.getNumeMagazin()+" a fost adaugat cu succes!");
    }

    public List<Magazin> getMagazineleDetinutedeProprietarul(Proprietar proprietar){
        List<Magazin> magazineProprietar = new ArrayList<>();
        for(Magazin magazin: magazine){
            if(proprietar.equals(magazin.getProprietar()) == true){
                magazineProprietar.add(magazin);
            }
        }
        Collections.sort(magazineProprietar,
                Comparator.comparing(Magazin::getNumeMagazin)
                        .thenComparing(Magazin::getVenit)
                        .thenComparing(Magazin::getChirie)
                        .thenComparing(Magazin::getSuprafata));
        return magazineProprietar;
    }

    public double getVenitTotalProprietar(Proprietar proprietar){
        double venitTotal=0;
        for(Magazin magazin: getMagazineleDetinutedeProprietarul(proprietar)){
            venitTotal += magazin.getVenit();
        }
        return venitTotal;
    }
    public double getChirieTotalaProprietar(Proprietar proprietar){
        double chirieTotala=0;
        for(Magazin magazin: getMagazineleDetinutedeProprietarul(proprietar)){
            chirieTotala += magazin.getChirie();
        }
        return chirieTotala;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "magazine=" + magazine +
                '}';
    }
}
