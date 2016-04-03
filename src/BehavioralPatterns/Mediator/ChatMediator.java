package BehavioralPatterns.Mediator;

/**
 * Mediator interface which defines contracts for other classes
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
