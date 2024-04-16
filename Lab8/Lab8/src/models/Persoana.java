package models;

import java.io.Serializable;

public class Persoana implements Serializable {

    private String nume;
    private String prenume;
    private int varsta;

    private double suma;
    private String valuta;
    private static int index;

    public Persoana(String nume, String prenume, int varsta, double suma, String valuta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
        index++;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                "; prenume='" + prenume + '\'' +
                "; varsta=" + varsta + '\'' +
                "; suma='" + suma + '\'' +
                ", valuta='" + valuta +
                '}';
    }
}

