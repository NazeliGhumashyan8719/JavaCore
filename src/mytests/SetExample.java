package mytests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> nameSet = new LinkedHashSet<>();
        nameSet.add("Poxos");
        nameSet.add("Martiros");
        nameSet.add("Valod");
        nameSet.add("Arzuman");

        for (String s : nameSet) {
            System.out.println(s);
        }

    }
}

