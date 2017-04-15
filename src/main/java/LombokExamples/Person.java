package LombokExamples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nickolay on 13.04.17.
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private int salary;
    private int age;

}

