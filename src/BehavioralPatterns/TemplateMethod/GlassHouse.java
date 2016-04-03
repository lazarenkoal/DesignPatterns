package BehavioralPatterns.TemplateMethod;

/**
 * Concrete house
 *
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building glass pillars");
    }
}
