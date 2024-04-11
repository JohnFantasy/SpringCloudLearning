package deepintojava.DesignPatterns.patterns.factory.simpleFactory;

/**
 * @author fanyuzhuo
 * @createAt 2021-02-05 11:20
 * @description
 */
public class Tesla implements Car{
    @Override
    public void name() {
        System.out.println("Tesla");
    }
}
