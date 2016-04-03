package BehavioralPatterns.State;

/**
 * Concrete context
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
