package deepintojava.jvm.heapspace;

public class StackOverFlowTest {

    private static StackOverFlowTest obj = new StackOverFlowTest();
    private static StackOverFlowTest obj1 = new StackOverFlowTest();
    private static StackOverFlowTest obj2 = new StackOverFlowTest();
    private static StackOverFlowTest obj3 = new StackOverFlowTest();
    private static StackOverFlowTest obj4 = new StackOverFlowTest();
    private static StackOverFlowTest obj5 = new StackOverFlowTest();

    public StackOverFlowTest() {
        StackOverFlowTest.obj = new StackOverFlowTest();
        StackOverFlowTest.obj1 = new StackOverFlowTest();
        StackOverFlowTest.obj2 = new StackOverFlowTest();
        StackOverFlowTest.obj3 = new StackOverFlowTest();
        StackOverFlowTest.obj4 = new StackOverFlowTest();
        StackOverFlowTest.obj5 = new StackOverFlowTest();

    }

    public static void main(String[] args) {
        StackOverFlowTest stackOverFlowTest = new StackOverFlowTest();
        System.out.println(stackOverFlowTest);
    }
}
