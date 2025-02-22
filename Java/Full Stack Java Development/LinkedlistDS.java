import java.util.*;
public class LinkedlistDS {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Lovely");
        list1.add("Sarah");
        list1.add("Paul");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("BE");
        list2.add("ECE");
        list2.add("NEC");
        new LinkedlistDS().printList(list2);

    }
    void printList(List<String> list){
        for (String name: list) {
            System.out.println(name);
        }
    }

}
