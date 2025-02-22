import java.util.*;
public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lovely");
        list.add("Sarah");
        list.add("Paul");
        list.sort(null);//null preserves natural ordering
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
    void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while (data.hasNext()){
            System.out.println(data.next());
        }
    }
}
