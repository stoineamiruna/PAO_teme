package shopping;

public record CreditCard(String utilizator) implements BankCard{
    private static double spentAmount;
    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount + "\nSuma totala cheltuita cu carduri de credit este " + spentAmount);
    }
}
