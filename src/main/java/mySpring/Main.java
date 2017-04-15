package mySpring;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nickolay on 06.04.17.
 */

public class Main {
    public static void main(String[] args) {
        ObjectFactory factory = ObjectFactory.getInstance();
//        IRobot iRobot = factory.createObject(IRobot.class);
//        iRobot.cleanRoom();
        Elf elf = factory.createObject(Elf.class);
        System.out.println(elf);
    }
}
