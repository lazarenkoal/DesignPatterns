package BehavioralPatterns.Mediator;

/**
 * Concrete colleague
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}