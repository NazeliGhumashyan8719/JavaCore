package homework5;

public class ArraySort {

    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};      // մասսիվի էլէմէնտները դասավորել աճման կարգով
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int max = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = max;
                }
            }
        }
        for (int n = 0; n < numbers.length; n++) {         // մասսիվի էլեմենտները դասավորել նվազման կարգով
            System.out.print(numbers[n] + " ");

        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int min = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
        for (int h = 0; h < numbers.length; h++) {
            System.out.print(numbers[h] + " ");

        }

    }

}


























