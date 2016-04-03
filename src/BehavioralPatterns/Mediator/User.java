package BehavioralPatterns.Mediator;

/**
 * Colleague interface
 * <p>
 * Created by aleksandrlazarenko on 03.04.16.
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}