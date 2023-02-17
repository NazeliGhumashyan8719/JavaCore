package chapter7.overload.overload3;

/* В данном примере конструкторы определяется
   в классе Box для инициализации размеров
   параллелепипеда тремя разным способами
 */
public class Box {
    double width;
    double heigth;
    double depth;

    // конструктор, используемый когда
    // указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    // конструктор,используемый, когда
    // ни один из размеров не указан
    Box() {
        width = -1;   // использовать значение -1 для
        heigth = -1;  // обазначения неинициализированного
        depth = -1;   // параллепипеда
    }

    // конструктор используемый при создании куба
    Box(double len) {
        width = heigth = depth = len;
    }

    // рассчитать и возврвтить объем
    double volume() {
        return width * heigth * depth;
    }
}
