package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Factory.Computer;

/**
 * Abstract Factory interface for our factories
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public interface ComputerAbstractFactory {

    /**
     * Note, that
     * @return THE INSTANCE OF COMPUTER!!!
     */
    public Computer createComputer();
}
