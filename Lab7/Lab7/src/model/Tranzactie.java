package model;

import static model.Currency.EUR;

public class Tranzactie extends ConversieCalculImpl implements Cloneable {
    //contine id, Payment, currency, amount, refNmb
    private int id;
    private Payment payment;
    private Currency currency = EUR;
    private double amount;
    private int refNmb;

    public Tranzactie(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.amount = payment.getAmount();
        this.amount = conversieValutaToEur(this.currency, this.amount);
    }

    public void stornareTranzactie() throws CloneNotSupportedException {
        this.amount *= (-1);
        this.payment = (Payment) payment.clone();
        this.payment.stornarePlata();
        this.refNmb = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb='" + refNmb + '\'' +
                '}';
    }
}
