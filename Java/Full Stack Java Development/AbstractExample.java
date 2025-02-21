abstract class Windows{
    public void display(){
        System.out.println("This is Windows OS");
    }
    abstract void feature();
}
class OS extends Windows{
    @Override
    void feature() {
        System.out.println("User Friendly OS");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
         OS os=new OS();
         os.feature();

    }
}
