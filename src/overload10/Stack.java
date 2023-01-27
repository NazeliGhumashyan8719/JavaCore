package overload10;

// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
public class Stack {
    /* Теперь пременные stack и tos  являются закрытыми,
    Это означаетб что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек
     */
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // расместить элемент из стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else
            stck[++tos] = item;
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


