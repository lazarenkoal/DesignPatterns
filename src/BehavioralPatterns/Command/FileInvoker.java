package BehavioralPatterns.Command;

/**
 * Simple invoker
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
