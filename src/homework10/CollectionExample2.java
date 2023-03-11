package homework10;

import javax.lang.model.element.Name;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("name" + i);
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("unrepeat names");
        for (String name : names) {
            System.out.println(name);
        }
        TreeSet<String> Names = new TreeSet<>();
        Names.add("Aram");
        Names.add("Onik");
        Names.add("Raz");
        Names.add("Lala");
        Names.add("Mane");
        Names.add("Nane");
        Names.add("Elen");
        Names.add("Shake");
        Names.add("Sose");
        Names.add("Vram");

        System.out.println("sorted names");
        for (String name : Names) {
            System.out.println(name);

        }

    }
}





