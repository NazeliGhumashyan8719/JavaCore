package chapter3;

public class Coversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nпреобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nпреобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nпреобразование типа double в тип byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);


    }
}
