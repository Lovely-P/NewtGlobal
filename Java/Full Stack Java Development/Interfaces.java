//Multiple inheritance using interfaces

interface Father{
     void gender();
}
interface Mother{
    void gender();
}
class Child implements Father,Mother{
    public void gender(){
        System.out.println("Male");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Child c = new Child();
        c.gender();
    }
}
