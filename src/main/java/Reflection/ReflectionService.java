package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by nickolay on 06.04.17.
 */
public class ReflectionService {
    public void printAPI(Object o) throws InvocationTargetException, IllegalAccessException {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.isAnnotationPresent(Run.class)) {
                method.invoke(o);
            }
        }
    }
}
