package BehavioralPatterns.ChainOfResponsibility;

/**
 * Concrete chain item
 * <p>
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) this.chain.dispense(new
                    Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }
}
