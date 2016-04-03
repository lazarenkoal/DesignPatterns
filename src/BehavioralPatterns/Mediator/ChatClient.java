package BehavioralPatterns.Mediator;

/**
 * Mediator testing class
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class ChatClient {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Sasha");
        User user2 = new UserImpl(mediator, "Masha");
        User user3 = new UserImpl(mediator, "sd");
        User user4 = new UserImpl(mediator, "sdfs");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
