import java.util.*;
class IntWrapper{
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public IntWrapper(int num) {
        this.num = num;
    }
}
public class AutoBoxingNUnboxing {
        public static void main(String[] args) {
         ArrayList<Integer> numbersList = new ArrayList<>();
         numbersList.add(25); // Autoboxing
         System.out.println(numbersList.get(0)); // Auto unboxing

            ArrayList<IntWrapper> numbersList2 = new ArrayList<>();
            numbersList2.add(new IntWrapper(65)); // boxing
            System.out.println(numbersList2.get(0).getNum()); // unboxing

        }
}
