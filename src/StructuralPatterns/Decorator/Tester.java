package StructuralPatterns.Decorator;

/**
 * Created by aleksandrlazarenko on 02.04.16.
 */
public class Tester {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar()); sportsCar.assemble(); System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
