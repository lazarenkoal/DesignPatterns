package BehavioralPatterns.State;

/**
 * Concrete state
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
