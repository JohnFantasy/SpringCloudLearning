package deepintojava.jvm.maizixueyuan.oomtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanyuzhuo
 * @createAt 2021-01-31 16:32
 * @description
 */
public class HeatOOMTest1 {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
