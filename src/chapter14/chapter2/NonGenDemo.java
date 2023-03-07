package chapter14.chapter2;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();
        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();
        String str = (String) strOb.getob();
        System.out.println("Знаение: " + str);
        iOb = strOb;
        v = (Integer) iOb.getob();
    }

}
