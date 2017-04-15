package mySpring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by nickolay on 06.04.17.
 */

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurer> objectConfigurers = new ArrayList<>();
    private Reflections scanner = new Reflections("mySpring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }
    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurer>> classes = scanner.getSubTypesOf(ObjectConfigurer.class);
        for (Class<? extends ObjectConfigurer> aClass : classes) {
            objectConfigurers.add(aClass.newInstance());

        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);

        T t = type.newInstance();
        configure(t);

        return t;
    }

    private <T> void configure(T t) {
        for (ObjectConfigurer objectConfigurer : objectConfigurers) {
            objectConfigurer.configure(t);
        }
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImpl(type);
        }
        return type;
    }
}
