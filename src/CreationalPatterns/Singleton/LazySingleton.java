package CreationalPatterns.Singleton;

/**
 * Simply, creates an instance in the global access method
 *
 * This implementation is thread unsafe
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }
}
