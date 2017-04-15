package mySpring;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Random;

/**
 * Created by nickolay on 14.04.17.
 */
@ToString
public class Elf {
    @InjectRandomInt(min = 10, max = 30)
    private int power;
    @InjectRandomInt(min = 100, max = 150)
    private int dexterity;



}
