package chapter12.chapter2;

public class EnumDemo2 {
    public static void main(String[] args) {
            Apple ap;
            System.out.println("Константы перечислимого типа Apple:");
            Apple allapples[] = Apple.values();
            for (Apple a : allapples) {
                System.out.println(a);
            }

                System.out.println();

                ap = Apple.valueOf("Winesap");
                System.out.println("Переменная ap содержит " + ap);


            }
        }


