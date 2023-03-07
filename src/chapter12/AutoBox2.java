package chapter12;

public class AutoBox2 {
    // @ndunel Integer ev veradardznel int
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
