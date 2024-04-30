import model.Magazin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ///  1.Sa se defineasca un array de Integers.
        System.out.println("Exercitiul 1\n");
        Integer[] array = {2,5,2,8,3,6};
        System.out.println("Array-ul initial: " + Arrays.toString(array));
        //   Sa se sorteze descrescator folosind lambda expression
        Arrays.sort(array, (o1, o2) -> ((Integer)o2).compareTo(((Integer)o1)));
        System.out.println("Array-ul soratat descrescator: " + Arrays.toString(array));

        //   Sa se calculeze suma intregilor folosind reduce
        Integer suma = Arrays.stream(array).reduce(0, (x,y) -> x+y);
        System.out.println("Suma folosind reduce: " + suma);

        //   Sa se calculeze suma intregilor folosind summingInt
        suma = Arrays.stream(array).collect(summingInt(value -> value));
        System.out.println("Suma folosind summingInt: " + suma);

        //   Sa se calculeze media folosind lambda averagingInt
        double media = Arrays.stream(array).collect(averagingInt(value -> value));
        System.out.println("Media folosind averagingInt: " + media);

        //   Sa se afiseze min folosind lambda.
        int minim = Arrays.stream(array).min((a, b) -> a.intValue() - b.intValue()).get();
        System.out.println("Minimul folosind lambda: " + minim);

        //   Sa se afiseze max folosind lambda
        int maxim = Arrays.stream(array).max((a, b) -> a.intValue() - b.intValue()).get();
        System.out.println("Maximul folosind lambda: " + maxim);

        //   Sa se afiseze intregii mai mari de o anumita valoare folosind filter
        List<Integer> arrayStream = Arrays.stream(array).filter(x -> x.intValue()>4).sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        System.out.println("Lista cu intregii mai mari decat 10 folosind filter: " + arrayStream);

        //   2. Se defineste un array de primitive int
        System.out.println("\nExercitiul 2\n");
        int[] arrayInt = {2,5,2,8,3,6};
        System.out.println("Array-ul de primitive int initial: " + Arrays.toString(arrayInt));

        //   sa se sorteze crescator
        Arrays.sort(arrayInt);
        System.out.println("Array-ul sortat crescator: " + Arrays.toString(arrayInt));

        //   Sa se sorteze descrescator -> se foloseste stream
        Integer[] arrayIntToInteger = Arrays.stream(arrayInt).boxed().toArray(Integer[]::new);
        List<Integer> arrayIntDescrescator = Arrays.stream(arrayIntToInteger).map(x -> -x.intValue()).sorted(Comparator.comparing(Integer::intValue)).map(x -> -x.intValue()).collect(Collectors.toList());
        System.out.println("Array-ul sortat descrescator: " + arrayIntDescrescator);

        //   Lista cu elementele ar2 ridicate la patrat (map)
        Integer[] arrayIntPatrat = Arrays.stream(arrayInt).boxed().map(x->x*x).toArray(Integer[]::new);
        System.out.println("Array-ul ridicat la patrat: " + Arrays.toString(arrayIntPatrat));

        //3. Se defineste o lista de obiecte Magazin
        System.out.println("\nExercitiul 3\n");
        //   Magazin are: numeMagazin, numarAngajati
        Magazin[] arrayMagazin = new Magazin[]{new Magazin("Jumbo", 32),
                new Magazin("H&M", 12),
                new Magazin("Carrefour", 32),
                new Magazin("Animax", 9),
                new Magazin("Bershka", 12)};
        System.out.println("arrayMagazin = " + arrayMagazin);

        //   sa se afiseze magazinele grupate by numarAngajati
        List<Magazin> magazinList = Arrays.asList(arrayMagazin);
        Map<Integer, List<Magazin>> mapGoupingByNrAng = magazinList.stream().collect(groupingBy(Magazin::getNumarAngajati));
        System.out.println("mapGoupingByNrAngajati = " + mapGoupingByNrAng);

        //   sa se afiseze suma angajatilor din toate magazinele
        Integer sumaAngajati = magazinList.stream().collect(summingInt(Magazin::getNumarAngajati));
        System.out.println("sumaAngajati = " + sumaAngajati);
    }
}