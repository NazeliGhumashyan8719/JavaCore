package box7;

/*  В данном примере программы для инициализации
    размеров параллелепипеда в классе Box применяется
    параметризированный конструктор
 */
public class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

