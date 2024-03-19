package shopping;

public class ShoppingMall {
    private final BankCard bankCard;
    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }
    public void achizitie(double amount){
        bankCard.doTransaction(amount);
    }
}
