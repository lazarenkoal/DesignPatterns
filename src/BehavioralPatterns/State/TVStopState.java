package BehavioralPatterns.State;

/**
 * Stops the TV
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
