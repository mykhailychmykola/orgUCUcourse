package Reflection;

/**
 * Created by nickolay on 06.04.17.
 */
public class ProstoTak {
    public void doX() {
        System.out.println("XXXXXXXXX");
    }
    public void doY() {
        System.out.println("YYYYYYY");
    }

    @Run
    public void ABC() {
        System.out.println("Started");
    }
}
