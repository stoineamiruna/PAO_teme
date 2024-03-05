/*
3
Scrieți o metodă care returnează elementul N al secvenței Fibonacci. N este citit de la tastatura
Exemplu de secventa Fibonacci 1 2 3 5 8
Cum se formeaza secventa Fibonacci:
1 2 (suma anterioarelor doua numere) ...

 */
import java.util.Scanner;
public class Exercitiul3 {
    public static int Fibonacci(int N) {
        if(N <= 0)
            return -1;
        else if(N == 1)
            return 1;
        else if(N == 2)
            return 2;
        else
            return Fibonacci(N-1) + Fibonacci(N-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dati numarul de ordine al elementului asociat dorit din sirul Fibonacci:");
        int N = scanner.nextInt();

        if(N==1)
            System.out.println("Primul element din sirul lui Fibonacci este "+Fibonacci(N));
        else
            System.out.println("Al "+N+"-lea element din sirul lui Fibonacci este "+Fibonacci(N));

    }
}
