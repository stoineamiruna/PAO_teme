package model;

public class Magazin {
    private String numeMagazin;
    private Integer numarAngajati;

    public Magazin(String numeMagazin, Integer numarAngajati) {
        this.numeMagazin = numeMagazin;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Integer getNumarAngajati() {
        return numarAngajati;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "numeMagazin='" + numeMagazin + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
