import shopping.CreditCard;
import shopping.DebitCard;
import shopping.ShoppingMall;

public class Application {
    public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall(new DebitCard("Popa Andrei", 500));

        System.out.println("Achizitii cu cardul de debit:\n");
        shoppingMall.achizitie(200);
        System.out.print("\n");
        shoppingMall.achizitie(400);
        System.out.print("\n");
        shoppingMall.achizitie(600);

        System.out.println("\n\nAchizitii cu cardul de credit:");
        shoppingMall = new ShoppingMall(new CreditCard("Balcea Carmen"));
        shoppingMall.achizitie(150);
        System.out.print("\n");
        shoppingMall.achizitie(550);

    }
}