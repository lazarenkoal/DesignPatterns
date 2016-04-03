package BehavioralPatterns.ChainOfResponsibility;

/**
 * Base class
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class Currency {
    private int amount;

    public Currency(int amt) {
        this.amount=amt;
    }

    public int getAmount() {
        return this.amount;
    }
}
