package othertests;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double i1 = sc.nextDouble();
            double i2 = sc.nextDouble();
            System.out.println(i1 + i2);
        }
    }
}

