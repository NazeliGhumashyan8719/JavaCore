package homework7;

public class Calculator {
    double plus(double a, double b) {
        double sum;
        sum = a + b;
        return sum;

    }

    double minus(double a, double b) {
        double dif;
        dif = a - b;
        return dif;
    }

    double multiply(double a, double b) {
        double mul;
        mul = a * b;
        return mul;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Թիվը 0-ի չի բաժանվում");
            return -1;
        }
        return a / b;

    }
}





































