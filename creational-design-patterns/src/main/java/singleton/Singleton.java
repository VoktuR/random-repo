package singleton;

public class Singleton {

    private static volatile Singleton instance;

    private String singletonValue;

    private Singleton() {
    }

    private Singleton(String singletonValue) {
        this.singletonValue = singletonValue;
    }

    public static Singleton getInstance(String singletonValue) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(singletonValue);
                }
            }
        }
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "singletonValue='" + singletonValue + '\'' +
                '}';
    }
}
