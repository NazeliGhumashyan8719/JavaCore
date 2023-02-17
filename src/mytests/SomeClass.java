package mytests;

public class SomeClass {

    public static void main(String[] args) {
        boolean flag = true;
        int value;
        if (flag) {
            value = flag ? 1 : 2;
        } else {
            value = flag ? 1 : 2;
        }
        System.out.println(value);
    }
}
