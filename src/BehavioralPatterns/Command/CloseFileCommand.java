package BehavioralPatterns.Command;

/**
 * Another concrete command
 * <p>
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
