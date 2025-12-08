package gr.aueb.cf.cf9.ch13;

/**
 * Singleton Design pattern.
 * And it allows only one instance to exist.
 */
public class OnlyOneCodingFactory {

    //Eager initialization. The instance gets created once the class is loaded
    private final static OnlyOneCodingFactory instance = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {

    }

    public static OnlyOneCodingFactory getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("I am doing something");
    }
}
