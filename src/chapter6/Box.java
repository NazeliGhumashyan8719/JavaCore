package chapter6;
/* Программаб использующая класс Box
   Присвоить исходному файлу имя BoxDemo.java
*/
// В этой программе применяется метод,
// введенный в класс Box

public class Box {
    double width;
    double height;
    double depth;

    // В этом классе объявляется объект типа Box
// вывести объем параллелепипеда
    void volumе() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

    // рассчитать и возврвтиь объем
    double volume() {
        return width * height * depth;
    }

    // устоновить размеры паралелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Это конструктор класса Box
    Box() {
        System.out.println("конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }


}




