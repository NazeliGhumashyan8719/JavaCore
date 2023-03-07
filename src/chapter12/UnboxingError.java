package chapter12;

// Ошибка, порождаемая ручной распаковкой
public class UnboxingError {

    public static void main(String[] args) {

        Integer iOb = 1000;
        int i = iOb.byteValue();
        System.out.println(i);

    }
}
