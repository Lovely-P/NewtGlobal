import java.util.*;
public class StackDS {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);
        System.out.println(numbers);
        System.out.println(numbers.search(10));
        System.out.println(numbers.search(5));
        System.out.println(numbers.pop());
        System.out.println(numbers);
    }
}
