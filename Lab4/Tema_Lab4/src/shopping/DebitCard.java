package shopping;

public record DebitCard(String utilizator, double limitAmount) implements BankCard{
    private static double spentAmount;
    @Override
    public void doTransaction(double amount) {
        if(amount > this.limitAmount)
            System.out.println("Not enough money!");
        else
        {
            spentAmount += amount;
            System.out.println("Utilizator " + utilizator + " a cheltuit " + amount + "\nSuma totala cheltuita cu carduri de debit este " + spentAmount);
        }
    }
}
