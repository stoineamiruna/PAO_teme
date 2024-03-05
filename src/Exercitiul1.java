//1 Scrieți un program Java care afișează numerele divizibile cu 3 de la 1 la 99.
public class Exercitiul1 {
    public static void main(String[] args) {

        System.out.println("Numerele divizibile cu 3 de la 1 la 99 sunt: ");

        for (int i = 3; i <= 99; i+=3) {

            System.out.print(i+" ");
        }
    }
}