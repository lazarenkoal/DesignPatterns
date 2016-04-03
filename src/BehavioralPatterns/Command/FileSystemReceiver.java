package BehavioralPatterns.Command;

/**
 * Conctract for concrete implementation
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
