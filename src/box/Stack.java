package box;

// В этом классе определяется целсленный очистекб где
// можно хранить до 10  целсленных значений
public class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // расместить элемент в стеке
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



