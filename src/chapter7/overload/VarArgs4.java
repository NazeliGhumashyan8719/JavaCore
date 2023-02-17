package chapter7.overload;

// Аргументы переменной длины, перегрузка и
// неоднозначность. Эта программа содержит ошибку,
// и поэтому она не подлежит компилации!
public class VarArgs4 {

    static void vaTest(int... v) {
        System.out.print(" vaTest(int ...): " + " Количество аргументов: " +
                +v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) "
        + "Количество аргументов: " + v.length + "Содержимое :");
        for(boolean x : v) {
            System.out.print(x + " ");
        }
            System.out.println();
        }

    public static void main(String args[]) {
        vaTest(1, 2, 3);               // Верно!
        vaTest(true, false, false);   // Верно!
       // vaTest();        // ОШИБКА! неодназначность!
    }
}


