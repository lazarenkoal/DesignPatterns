package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Factory.Computer;

/**
 * Consumer class, aka Entry point
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {

        return factory.createComputer();
    }
}
