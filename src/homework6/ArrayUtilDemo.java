package homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {4, 7, 3, 12, 30, 16, 5, 11, 20, 8};
        ArrayUtil au = new ArrayUtil();
        au.elementsOfArray(array);
        au.firstElementOfArray(array);
        au.lastElementOfArray(array);
        au.centreElementOfArray(array);
        au.maxOfArray(array);
        au.minOfArray(array);
        au.averageOfArray(array);
        au.numberOfEvenElementsOfArray(array);
        au.numbersOfOddElementsOfArray(array);
        au.oddElementsOfArray(array);
        au.evenElementsOfArray(array);
        au.sumOfArray(array);

    }
}
