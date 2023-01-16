package chapter6;

public class BoxDemo6 {

    public static void main(String[] args) {
        // объявить выделить память и инициализироваать
        // объекты типа Box

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println(vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println(vol);
    }
}
