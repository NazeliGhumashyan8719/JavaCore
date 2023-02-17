package chapter7.overload.overload2;

// Применить автоматическое преобразование типов к перегрузке
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсуствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове " + " test(double) a: " + a);
    }
}


