package chapter7.overload.overload9;

/* В этой программе демонстрируется отличие
модификаторов  public и private.
 */
public class Test {
    int a;           // доступ,определяемый по умолчанию
    public int b;    // открытый доступ
    private int c;   // закрытый доступ

    // методы доступа к члену с данного класса
    void setc(int i) {
        // устонавить значение члена с данного класса
        c = i;
    }

    int getc() {
        // получить значение члена с данного класса
        return c;
    }
}
