package exercitii;

import exceptii.MyException;
import models.Persoana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainEx1CitireChar {
    private static final String fisierPersoane = "persoaneChar.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fisierPersoane));
        String linie;
        List<Persoana> persoane = new ArrayList<>();

        while((linie = br.readLine()) != null){
            Pattern pattern = Pattern.compile("nume='(.*?)'; prenume='(.*?)'; varsta=(.*?)'; suma='(.*?)', valuta='(.*?)}");
            Matcher matcher = pattern.matcher(linie);
            if (matcher.find()) {
                String nume = matcher.group(1);
                String prenume = matcher.group(2);
                int varsta = Integer.parseInt(matcher.group(3));
                double suma = Double.parseDouble(matcher.group(4));
                String valuta = matcher.group(5);

                Persoana persoana = new Persoana(nume, prenume, varsta, suma, valuta);
                persoane.add(persoana);
            }
        }
        afisarePersoane(persoane);

    }

    private static void afisarePersoane(List<Persoana> persoane){
        Map<String, List<Persoana>> gruparePersoane = new HashMap<>();
        for (Persoana persoana : persoane) {
            String cheie = persoana.getNume() + " " + persoana.getPrenume();
            gruparePersoane.computeIfAbsent(cheie, k -> new ArrayList<>()).add(persoana);
        }

        for (List<Persoana> grup : gruparePersoane.values()) {
            if (grup.size() > 1) {
                System.out.println("Persoanele cu același nume și prenume sunt:");
                for (Persoana persoana : grup) {
                    System.out.println(persoana);
                }
                System.out.println();
            }
        }
    }
}
