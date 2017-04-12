package mySpring;

/**
 * Created by nickolay on 06.04.17.
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
