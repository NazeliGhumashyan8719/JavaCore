package chapter14.chapter3;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);

    }
}
