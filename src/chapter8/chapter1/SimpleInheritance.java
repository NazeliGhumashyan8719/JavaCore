package chapter8.chapter1;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта subOb; ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ ко всем открытым членам своего суперкласса. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j, k и в объекте subOb: ");
        subOb.sum();

    }
}
