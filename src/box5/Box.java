package box5;

// В этой программе применяется метод с параметрами
public class Box {
    double width;
    double height;
    double depth;

    // рассчитать и возврвтить объем
    double volume() {
        return width * height * depth;
    }

    // установить размеры паралелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
