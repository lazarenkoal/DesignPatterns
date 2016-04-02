package StructuralPatterns.Decorator;

/**
 * Here is the decorator class
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */
class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
