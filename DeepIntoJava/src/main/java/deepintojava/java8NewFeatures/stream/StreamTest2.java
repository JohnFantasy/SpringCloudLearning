package deepintojava.java8NewFeatures.stream;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {
        // 使用Stream的静态方法of()创建流
        Stream.of("a", "b", "c")
                .forEach(System.out::println);

    }
}



@Data
@Accessors(chain = true)
class Vehicle {
    private Integer age;
    private String name;
    private String description;
}

@Getter
@Setter
@Accessors(chain = true)
@ToString
@EqualsAndHashCode
class CellPhone {
    private String brand;
    private Integer orderNo;
    private String version;
}

@Data
@Accessors(chain = true)
class Character {
    private String certId;
    private String name;
    private Car car;
    private List<Phone> phones;
}
