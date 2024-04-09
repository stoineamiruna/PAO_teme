package model;

public class User {
    private String nume;
    private String prenume;
    private String iban;

    public User(String nume, String prenume, String iban) {
        this.nume = nume;
        this.prenume = prenume;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
