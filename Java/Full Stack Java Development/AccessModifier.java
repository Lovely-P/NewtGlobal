class Other {
    private int x=10;
    public void message(){
        System.out.println(x);
    }
}


public class AccessModifier {
    public static void main(String[] args) {
        Other other = new Other();
        //System.out.println(other.x);
        other.message();

    }
}
