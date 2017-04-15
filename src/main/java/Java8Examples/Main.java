package Java8Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nickolay on 15.04.17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "scala", "python", "c#");
        strings.sort((s, t1) -> s.length() - t1.length());

        strings.forEach(System.out::println);
    }
}
