package CreationalPatterns.Factory;

/**
 * Superclass
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ",CPU=" + this.getCPU();
    }
}
