package StructuralPatterns.Decorator;

/**
 * Concrete decorators
 * <p>
 * Created by aleksandrlazarenko on 02.04.16.
 */
class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}