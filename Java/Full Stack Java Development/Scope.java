public class Scope {
    private int i = 55;

    public static void main(String[] args) {

        {
            int i = 100;
            System.out.println(i);
        }
      
        System.out.println(new Scope().i);
    }
}
