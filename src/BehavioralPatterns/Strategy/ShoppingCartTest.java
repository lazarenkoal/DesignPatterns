package BehavioralPatterns.Strategy;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class ShoppingCartTest {
    public static void main(String[] args) { ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("sdfsd",10);
        Item item2 = new Item("sdfdsfsdf",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
