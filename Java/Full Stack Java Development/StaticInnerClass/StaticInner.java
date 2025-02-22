public class StaticInner {
    public static void main(String[] args) {

        Outer.Inner.staticMessage();
        System.out.println(Outer.Inner.x);

    }
}
