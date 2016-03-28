package CreationalPatterns.Singleton;

/**
 * Static block initialization implementation
 * is similar to eager initialization,
 * except that instance of class is created in
 * the static block that provides option for exception handling.
 *
 * Even this one creates instance before user try to access it
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() { }

    // Static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Can not instantiate singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
