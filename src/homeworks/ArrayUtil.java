package homeworks;


public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {4, 7, 3, 12, 30, 16, 5, 11, 20, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        int i = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
        System.out.print(array[0]);

        int a = array.length - 1;
        System.out.print(array[a]);

        int b = 0;
        for (int j = 0; j <= array.length; j++) {
            if (j % 2 == 0) {
                b = b + 1;
            }
        }
        System.out.println();
        System.out.println(b);

        int k = 0;
        for (int j = 3; j <= array.length; j++) {
            if (j % 2 == 1) {
                k = k + 1;
            }
        }
        System.out.println(k);
        System.out.println();

        int h = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array.length / 2 == h) {
                h = array[j];
                System.out.println(h);
            }
        }
        int c = 0;
        for (int j = 0; j < array.length; j++) {
            c = c + array[j];
        }
        System.out.println(c / array.length);

        int d = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array.length / 2 == d) {
                d = array[j];
            }
        }
        System.out.println(d);
        System.out.println(array[array.length / 2]);

    }
}



















