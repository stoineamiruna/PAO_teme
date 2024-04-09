import model.Currency;
import model.Payment;
import model.Tranzactie;
import model.User;

import java.util.ArrayList;
import java.util.List;

import static model.Currency.GPB;
import static model.Currency.RON;

public class Main {
    private static List<Tranzactie> tranzactii = new ArrayList<>();
    private static List<Payment> plati = new ArrayList<>();

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Lupu", "Anca", "RO484884848444");


        //1) Facem mai multe plati si vor rezulta mai multe tranzactii. Cateva tranzactii le stornam.
        //Dupa stornare (nu inainte), afisam tranzactia initiala si tranzactia finala.
        Payment plata1 = new Payment(1000, GPB, user, "Chirie");
        Tranzactie tranzactie1 = new Tranzactie(1, plata1);
        tranzactii.add(tranzactie1);
        plati.add(plata1);

        Payment plata2 = new Payment(500, RON, user, "Electricitate");
        Tranzactie tranzactie2 = new Tranzactie(2, plata2);
        tranzactii.add(tranzactie2);
        plati.add(plata2);

        Payment plata3 = new Payment(235, RON, user, "Comanda H&M");
        Tranzactie tranzactie3 = new Tranzactie(3, plata3);
        tranzactii.add(tranzactie3);
        plati.add(plata3);

        Tranzactie tranzactie4 = (Tranzactie) tranzactie3.clone();
        tranzactie4.stornareTranzactie();
        tranzactii.add(tranzactie4);

        System.out.println("Tranzactia initiala: " + tranzactie3);
        System.out.println("Tranzactia finala: " + tranzactie4);


        //2) Sa se afiseze lista tarilor/zonei pentru care s-au facut plati

        List<String> tari = new ArrayList<>();
        for(Payment plata: plati)
            if(!tari.contains(plata.getCurrency().getNumeTara()))
                tari.add(plata.getCurrency().getNumeTara());
        System.out.println("\nLista zonelor pentru care s-au facut plati: " + tari);


        //3) Sa se afiseze Tranzactiile facute pentru un user, amountul si valuta in care a platit initial.
        //(se cauta in tranzactii deoarece e posibil ca unele plati sa nu fie finalizate cu tranzactie)

        tranzactiiUser("Lupu");

    }

    public static void tranzactiiUser(String nume){
        System.out.println("\nTranzactiile realizate de " + nume + ":\n");
        double amountTotal = 0;
        for(Tranzactie tranzactie: tranzactii){
            Currency valutaInitiala = tranzactie.getPayment().getCurrency();
            System.out.println(tranzactie + "\nValuta initiala: " + valutaInitiala + "\n");
            amountTotal += tranzactie.getAmount();
        }

        System.out.println("Amountul total: " + amountTotal);
    }
}