package BehavioralPatterns.Observer;

/**
 * Define contracts for all the
 * <p>
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface Subject {

    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers(); //method to get updates from subject

    public Object getUpdate(Observer obj);
}
