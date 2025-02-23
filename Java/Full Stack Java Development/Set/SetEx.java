import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lovely");
        set.add("Paul");
        set.add("Sarah");

        System.out.println(set);

        for (String name:set ) {
            System.out.println(name);

        }
        System.out.println(set.contains("Lovely"));

    }
}


