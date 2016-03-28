package CreationalPatterns.Singleton;

/**
 * The following class implements Singleton design pattern
 *
 * the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but
 * it has a drawback that instance is created even though
 * client application might not be using it.
 *
 * Good approach, if the class don't wanna use a lot of resources
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
class EagerSingleton {

    // Private static variable
    private static final EagerSingleton instance = new EagerSingleton();

    // Restricting the access to the class creation
    private EagerSingleton() {}

    // Global access point
    public static EagerSingleton getInstance() {
        return instance;
    }
}
