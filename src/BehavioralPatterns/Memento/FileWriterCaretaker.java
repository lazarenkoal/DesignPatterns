package BehavioralPatterns.Memento;


/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
