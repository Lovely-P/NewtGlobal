 class Parent {
     public final void India() {
         System.out.println("India is great!!");
     }

     public void USA() {
         System.out.println("USA is Fantastic!!");
     }
 }
 class Children  extends Parent{


     public void USA(){
         System.out.println("USA is Fantastic!! with nice people");
     }

 }

public class Final {
    public static void main(String[] args) {
        final int num=10;
       // num=100;
        System.out.println(num);
        Children child = new Children();
        child.India();
        child.USA();

    }
}
