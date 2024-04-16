package exercitii;

import models.Persoana;
import utils.FileManagement;
import java.io.IOException;
import java.util.*;

public class MainEx2CitireOcteti {

    private static final String fisierPersoane = "persoaneOcteti.txt";

    public static void main(String[] args)  {
        List<Persoana> persoane = new ArrayList<>();
        Arrays.stream(FileManagement.citireObiectDinFisier(fisierPersoane)).map(obj -> (Persoana) obj).forEach(persoane::add);
        afisarePersoane(persoane);


    }
    public static void afisarePersoane(List<Persoana> persoane){
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
