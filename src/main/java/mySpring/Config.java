package mySpring;

/**
 * Created by nickolay on 14.04.17.
 */
public interface Config {

    <T> Class<T> getImpl(Class<T> type);
}
