package BehavioralPatterns.TemplateMethod;

/**
 * Concrete house class
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building wooden pillars");
    }
}
