package homework6;

public class ArrayUtil {
    void elementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // tpel bolor elementner@
        }
        System.out.println();
    }


    void maxOfArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);         // tpel max element@
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);  // tpel min element@
    }

    void evenElementsOfArray(int[] array) {
        int i = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.print(array[j] + " "); // tpel zujg elementner@
            }
        }
        System.out.println();

    }

    void oddElementsOfArray(int[] array) {

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                System.out.print(array[j] + " "); // tpel kent elementner@
            }
        }
    }

    void firstElementOfArray(int[] array) {
        System.out.println();
        System.out.print(array[0]); // tpel arajin element@
        System.out.println();

    }

    void lastElementOfArray(int[] array) {
        int a = array.length - 1;
        System.out.print(array[a]); // tpel verjin element@

    }

    void numberOfEvenElementsOfArray(int[] array) {
        int b = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                b = b + 1; // tpel zujg elementneri qanak@
            }
        }
        System.out.println();
        System.out.println(b);
    }

    void numbersOfOddElementsOfArray(int[] array) {
        int k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                k = k + 1;
            }
        }
        System.out.println(k); // tpel kent elementneri qanak@
        System.out.println();
    }

    void averageOfArray(int[] array) {
        int c = 0;
        for (int j = 0; j < array.length; j++) {
            c = c + array[j];
        }
        System.out.println(c / array.length); //tpel mijin tvabanakan@

    }

    void sumOfArray(int[] array) {
        int d = 0;
        for (int j = 0; j < array.length; j++) {
            d = d + array[j];
        }
        System.out.println(d);         // tpel masivi elementneri gumar@

    }

    void centreElementOfArray(int[] array) {
        System.out.println(array[array.length / 2]); //tpel mejtexi tiv@

    }
}




