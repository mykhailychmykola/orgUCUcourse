package mySpring;



/**
 * Created by nickolay on 06.04.17.
 */

public class IRobot {
    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");

    }

    private void clean() {
        System.out.println("VVVVVVVVVVvvvvvvv");
    }


}
