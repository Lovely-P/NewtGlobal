import java.util.*;
class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        if (name.length() == obj.name.length()) {
            return 0;
        } else if (name.length() > obj.name.length()) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class ComparableInterface {
        public static void main(String[] args) {
            List names = new LinkedList<>();
            names.add(new Name("Lovely"));
            names.add(new Name("Paul"));
            names.add(new Name("Sarah"));
            System.out.println(names);
            names.sort(null);
            System.out.println(names);

        }
    }

