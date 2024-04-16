package exercitii;

import exceptii.MyException;
import models.Persoana;
import utils.FileManagement;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class MainEx2ScriereOcteti {

    private static final String fisierPersoane = "persoaneOcteti.txt";


    public static void main(String[] args) throws MyException, IOException {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Daca vreti sa iesiti, scrieti comanda QUIT. Daca vreti sa continuati citirea, scrieti comanda CONT");
            String comanda = scanner.nextLine();

            if (Objects.equals(comanda, "QUIT")) {
                continua = false;
            } else if (Objects.equals(comanda, "CONT")) {
                Persoana persoana = citestePersoana(scanner);
                if (persoana != null) {
                    FileManagement.scriereObiectInFisier(fisierPersoane, persoana);
                }
            }

        }
    }

    private static void checkValue(double suma) throws MyException {
        if(suma > 2000){
            System.out.println("bigger than 2000");
            throw new MyException("suma is bigger than 2000");
        }
    }
    private static Persoana citestePersoana(Scanner scanner) throws MyException {
        String nume, prenume, valuta;
        int varsta;
        double suma;
        System.out.println("Dati numele persoanei: ");
        nume = scanner.nextLine();

        System.out.println("Dati prenumele persoanei: ");
        prenume = scanner.nextLine();

        System.out.println("Dati varsta persoanei: ");
        varsta = scanner.nextInt();

        System.out.println("Dati suma: ");
        suma = scanner.nextDouble();
        scanner.nextLine();

        try{
            checkValue(suma);
            System.out.println("Dati valuta: ");
            valuta = scanner.nextLine();

            Persoana p = new Persoana(nume, prenume, varsta, suma, valuta);
            return p;
        }
        catch (MyException e){
            return null;
        }


    }

}

