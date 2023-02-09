package tests;

public class MyTester {

    public static void main(String[] args) {
        if ((isSmallNumber(3)) || (isSmallNumber(7))) {
            System.out.println("Small Number");
        }
        if ((isSmallNumber(6)) || ((isSmallNumber(9)))) {
            System.out.println("Small Number");
        }
    }

    public static boolean isSmallNumber(int n) {
        if (n < 5) {
            System.out.println("n < 5");
            return true;
        } else {
            System.out.println("n >= 5");
            return false;
        }
    }
}
