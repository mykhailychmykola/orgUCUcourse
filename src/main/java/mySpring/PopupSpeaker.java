package mySpring;

import javax.swing.*;

/**
 * Created by nickolay on 14.04.17.
 */
public class PopupSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
