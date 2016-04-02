package StructuralPatterns.Decorator;

/**
 * Basic implementation of component
 *
 * Created by aleksandrlazarenko on 02.04.16.
 */
class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic car");
    }
}
