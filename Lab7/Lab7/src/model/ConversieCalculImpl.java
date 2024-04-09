package model;

public class ConversieCalculImpl implements ConversieCalcul{
    @Override
    public double conversieValutaToEur(Currency currency, double amount) {
        switch(currency){
            case RON:
                amount = 0.2*amount;
                break;
            case GPB:
                amount = 1.17*amount;
                break;
            case USD:
                amount = 0.92*amount;
                break;
            case TRY:
                amount = 0.029*amount;
                break;
            default:
                break;
        }
        return amount;
    }

    @Override
    public void calculRata(Currency currency) {

    }
}
