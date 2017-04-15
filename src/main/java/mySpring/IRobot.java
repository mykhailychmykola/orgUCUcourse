package mySpring;



/**
 * Created by nickolay on 06.04.17.
 */

public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");

    }

    private void clean() {
        System.out.println("VVVVVVVVVVvvvvvvv");
    }


}
