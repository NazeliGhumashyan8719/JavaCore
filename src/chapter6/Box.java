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
}
