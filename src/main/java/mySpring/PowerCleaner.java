package mySpring;

/**
 * Created by nickolay on 15.04.17.
 */
@Benchmark
public class PowerCleaner implements Cleaner{
    @InjectRandomInt(min=3, max=8)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VACLAV");
        }
    }
}
