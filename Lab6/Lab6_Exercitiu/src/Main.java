import model.*;

import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FunctieGenerica chimicale = new MagazinChimicale();
        FunctieGenerica alimentar = new MagazinAlimentar();
        FunctieGenerica haine = new MagazinHaine();
        ShoppingMall shoppingMall = new ShoppingMall();

        Proprietar proprietar1 = new Proprietar("Dobrescu", "Martin", 43);
        Proprietar proprietar2 = new Proprietar("Marin", "Andrei", 38);

        Magazin magazinChimicale1 = new Magazin(1, "Intel Sport", proprietar1, 13000, 12000);
        magazinChimicale1.setChirie(chimicale);
        Magazin magazinAlimentar1 = new Magazin(2, "Penny S", proprietar1, 12000, 13000);
        magazinAlimentar1.setChirie(alimentar);
        Magazin magazinHaine1 = new Magazin(3, "H&M", proprietar2, 145000, 10000);
        magazinHaine1.setChirie(haine);
        Magazin magazinChimicale2 = new Magazin(4, "SC Moto", proprietar2, 120000, 11000);
        magazinChimicale2.setChirie(chimicale);

        shoppingMall.addMagazin(magazinChimicale1);
        shoppingMall.addMagazin(magazinAlimentar1);
        shoppingMall.addMagazin(magazinChimicale2);
        shoppingMall.addMagazin(magazinHaine1);

        System.out.println("\nshoppingMall nesortat = \n" + shoppingMall);

        Collections.sort(shoppingMall.getMagazine(), new MagazinComparatorMultiple());
        System.out.println("\n\nshoppingMall sortat =\n" + shoppingMall+"\n");

        System.out.println("Magazinele proprietarului "+proprietar1+"\n" + shoppingMall.getMagazineleDetinutedeProprietarul(proprietar1));

        System.out.println("\nVenitul total obtinut de " + proprietar1 + " este "+shoppingMall.getVenitTotalProprietar(proprietar1));

        System.out.println("\nChiria totala platita de " + proprietar1 + " este "+shoppingMall.getChirieTotalaProprietar(proprietar1));

    }
}