package chapter7.overload.overload1;

public class Overload {

    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // вызвыть все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Резултат вызова ob.test(123.25): " + result);

    }
}

