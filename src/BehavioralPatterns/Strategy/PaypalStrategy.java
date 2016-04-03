package BehavioralPatterns.Strategy;

/**
 * Another concrete payment strategy
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
