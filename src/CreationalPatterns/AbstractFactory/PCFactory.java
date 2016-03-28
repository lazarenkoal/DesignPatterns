package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Factory.Computer;
import CreationalPatterns.Factory.PC;

/**
 * Subfactory for pc
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }

}
