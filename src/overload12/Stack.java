package overload12;

// Усовершенствованный класс  Stack, в котором
// используется сиойство длины массива
public class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разьетить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1) {
            // использовать свойство длины массива
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];

        }
    }
}

