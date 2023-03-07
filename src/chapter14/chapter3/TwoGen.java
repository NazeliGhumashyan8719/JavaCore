package chapter14.chapter3;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
