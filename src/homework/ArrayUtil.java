package homework;


public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {4, 7, 3, 12, 30, 16, 5, 11, 20, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // tpel bolor elementner@
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);     // tpel max element@

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);     // tpel min element@

        int i = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.print(array[j] + " "); // tpel zujg elementner@
            }
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                System.out.print(array[j] + " "); // tpel kent elementner@
            }
        }
        System.out.println();
        System.out.print(array[0]); // tpel arajin element@
        System.out.println();

        int a = array.length - 1;
        System.out.print(array[a]); // tpel verjin element@

        int b = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                b = b + 1; // tpel zujg elementneri qanak@
            }
        }
        System.out.println();
        System.out.println(b);

        int k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                k = k + 1;
            }
        }
        System.out.println(k); // tpel kent elementneri qanak@
        System.out.println();

        int c = 0;
        for (int j = 0; j < array.length; j++) {
            c = c + array[j];
        }
        System.out.println(c / array.length); //tpel mijin tvabanakan@

        int d = 0;
        for (int j = 0; j < array.length; j++) {
            d = d + array[j];
        }
        System.out.println(d);         // tpel masivi elementneri gumar@

        System.out.println(array[array.length / 2]); //tpel mejtexi tiv@

    }
}



















