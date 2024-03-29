package chapter14.chapter5;

public class WildcardDemo {

    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Starts<Integer> iob = new Starts<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Starts<Double> dob = new Starts<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Starts<Float> fob = new Starts<Float>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        System.out.println("Среднее значение iob и dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");

            System.out.println("Среднее iob и fob ");
            if (iob.sameAvg(fob)) {
                System.out.println("одинаковы.");
            } else {
                System.out.println("отличаются.");

            }
        }
    }
}



