package CreationalPatterns.AbstractFactory;

import CreationalPatterns.Factory.Computer;
import CreationalPatterns.Factory.Server;

/**
 * Second subfactory
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
