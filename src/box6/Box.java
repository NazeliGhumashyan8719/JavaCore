package box6;

/* В данном примере программы для инициализации размеров
 параллелепипеда в классе Box применяется конструктор
*/
public class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box() {
        System.out.println("Конструктирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

