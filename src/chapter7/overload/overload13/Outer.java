package chapter7.overload.overload13;

// Передемонстрировать применение внутреннего класса
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутпенный класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}


