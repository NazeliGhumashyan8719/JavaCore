package chapter14.chapter1;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
