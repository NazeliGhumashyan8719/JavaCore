package chapter7.overload.overload7;

//Прастой пример ркурсии
public class Factorial {
    // это рекурсивный метод
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}


