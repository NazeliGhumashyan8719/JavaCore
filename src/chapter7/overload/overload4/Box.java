package chapter7.overload.overload4;

// В этой версии класса Box один объект допускается
// инициализировать другим объектом
public class Box {
    double width;
    double height;
    double depth;

    // Обратить внимание на этот конструктор.В качестве
    // параметра в нем используется объект типа Box
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // констуктор, используемый, когда
    // указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //констуктор,р используемый,если ни один из
    // размеров не указан
    Box() {
        width = -1;  // использовать значение -1 для
        height = -1; // обозначение неинициализированного
        depth = -1; // параллелепипедп
    }

    // конструктор,используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и вазвратить объем
    double volume() {
        return width * height * depth;
    }
}


