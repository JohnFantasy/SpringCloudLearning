package deepintojava.javaFoundation.copytest.pojo;

import lombok.Data;

/**
 * @author fanyuzhuo
 * @createAt 2021-06-09 15:43
 * @description
 */
@Data
public class Car implements Cloneable{
    private String brand;

    private String type;
}
