package overload2;

public class Overload {

    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);          // здесь вызывается вариант
                             // метода test(double)
        ob.test(123.2);  // и здесь вызывается вариант
                           // метода test(double)
    }
}
