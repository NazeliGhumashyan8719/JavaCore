package homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        names.add("Ara");
        names.add("Aram");
        names.add("Gor");
        names.add("Lol");
        names.add("Raz");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println("name is");
        } else {
            System.out.println("name is not");

        }
        try {
            name = scanner.nextLine();
            names.contains((CharSequence) name);
            names.remove(name);
            System.out.println(names);
        } catch (ClassCastException exception) {


        }
    }
}










