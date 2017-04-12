package Reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by nickolay on 06.04.17.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ReflectionService reflectionService = new ReflectionService();
        ProstoTak prostoTak = new ProstoTak();
        reflectionService.printAPI(prostoTak);
    }
}
