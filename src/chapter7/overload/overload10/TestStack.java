package chapter7.overload.overload10;

public class TestStack {

    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 10; i++) {
        System.out.print(" " + mystack1.pop());
    }

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + mystack2.pop());
            // эти операторы недопустимы
            // mystack1.tos = -2;
            // mystack2.stck[3] = 100;

        }
    }
}







