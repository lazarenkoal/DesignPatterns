package CreationalPatterns.Singleton;

/**
 * Simply, the global access method is synchronized now
 *
 * Reduces the performance because of synchronized
 *
 * Created by aleksandrlazarenko on 28.03.16.
 */
class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance () {
        if (instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }
}
