package othertests;

import java.util.LinkedHashSet;

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

