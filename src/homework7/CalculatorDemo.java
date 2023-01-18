package homework7;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        System.out.println(mycalculator.plus(4.5, 3.4));
        System.out.println(mycalculator.minus(4.4, 2.2));
        System.out.println(mycalculator.multiply(1.5, 2.5));
        System.out.println(mycalculator.divide(8, 0));

    }
}


