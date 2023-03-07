package chapter14.chapter5;

public class Starts<T extends Number> {
    T[] nums;

    Starts(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Starts<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

}


