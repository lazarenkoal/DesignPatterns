package BehavioralPatterns.TemplateMethod;

/**
 * Created by aleksandrlazarenko on 03.04.16.
 */
public class HousingClient {

    public static void main(String ... str) {
        HouseTemplate template = new WoodenHouse();

        // using template method
        template.buildHouse();
        System.out.println("***********");

        // using template method
        template = new GlassHouse();
        template.buildHouse();
        System.out.println("end");
    }
}
