package BehavioralPatterns.Observer;

/**
 * Contract for the Observer
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);

}