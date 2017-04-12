package mySpring;

/**
 * Created by nickolay on 06.04.17.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }
    public Object createObject(Class type) {
        Object o = type.newInstance();
    }
}
