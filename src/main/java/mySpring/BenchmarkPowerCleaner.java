package mySpring;

import lombok.Builder;

import javax.sound.midi.Soundbank;

/**
 * Created by nickolay on 15.04.17.
 */
public class BenchmarkPowerCleaner implements Cleaner {
    @InjectByType
    private PowerCleaner powerCleaner;

    @Override
    public void clean(){
        long start = System.nanoTime();
        powerCleaner.clean();
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
