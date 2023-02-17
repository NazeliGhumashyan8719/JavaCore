package chapter9.mypack;

public class Balance {
    String name;
    double ba1;

    Balance(String n, double b) {
        name = n;
        ba1 = b;
    }

    void show() {
        if (ba1 < 0) {
            System.out.println("--> ");
            System.out.println(name + ": $" + ba1);
        }
    }
}
