/*
2 Scrieti un program java care citeste 3 numere de la tastatura si le compara
exemplu de afisaj: 2< 6 < 8

 */

import java.util.Scanner;
public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dati primul numar de comparat:");
        int a = scanner.nextInt();

        System.out.println("Dati al doilea numar de comparat:");
        int b = scanner.nextInt();

        System.out.println("Dati al treilea numar de comparat:");
        int c = scanner.nextInt();

        if(a==b){
            if(a==c){
                System.out.print(a+"="+b+"="+c);
            }
            else if(a>c){
                System.out.print(c+"<"+a+"="+b);
            }
            else{
                System.out.print(a+"="+b+"<"+c);
            }
        }
        else if (a>b){
            if(a==c){
                System.out.print(b+"<"+a+"="+c);
            }
            else if(a>c){
                if(b==c)
                    System.out.print(c+"="+b+"<"+a);
                else if (b<c)
                    System.out.print(b+"<"+c+"<"+a);
                else
                    System.out.print(c+"<"+b+"<"+a);
            }
            else{
                System.out.print(b+"<"+a+"<"+c);
            }
        }
        else {
            if(a==c){
                System.out.print(c+"="+a+"<"+b);
            }
            else if(a<c){
                if(b==c)
                    System.out.print(a+"<"+b+"="+c);
                else if (b<c)
                    System.out.print(a+"<"+b+"<"+c);
                else
                    System.out.print(a+"<"+c+"<"+b);
            }
            else{
                System.out.print(c+"<"+a+"<"+b);
            }
        }
    }
}

