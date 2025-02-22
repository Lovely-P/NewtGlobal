import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lovely");
        list.add("Paul");
        list.add("Sarah");
        list.add("Faith");
        list.add("Hope");
        list.add("Hannah");
        System.out.println(list);
        for (String temp: list) {
           System.out.println(temp);
        }

        System.out.println(list.get(3));
        list.remove(0);
        System.out.println(list);


    }
}
