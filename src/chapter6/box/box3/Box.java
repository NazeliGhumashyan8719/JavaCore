package chapter6.box.box3;
// В этой программе применяется метод,
// введеный в класс Box

public class Box {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volumе() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

}
