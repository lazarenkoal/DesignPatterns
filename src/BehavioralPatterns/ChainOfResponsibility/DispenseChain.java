package BehavioralPatterns.ChainOfResponsibility;

/**
 * Interface, which contains the information about processing algorithm
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
