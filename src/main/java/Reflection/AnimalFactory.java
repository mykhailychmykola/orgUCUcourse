package Reflection;

import java.util.Random;

/**
 * Created by nickolay on 06.04.17.
 */
public class AnimalFactory {
    public Animal createRandomAnimal() {
        Random random = new Random();
        random.nextInt(3);
        return null;
    }
}
