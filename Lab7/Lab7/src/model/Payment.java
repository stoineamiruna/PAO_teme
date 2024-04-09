package model;


public class Payment implements Cloneable{
    //amount, currency, model.User , purpose
    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public void stornarePlata(){
        this.amount *= (-1);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", user=" + user +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
