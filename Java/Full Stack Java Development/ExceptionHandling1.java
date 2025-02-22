
import java.io.*;
public class ExceptionHandling1 {

        public static void main(String[] args) {
            ExceptionHandling1 eh = new ExceptionHandling1();
            try {
                eh.doSomething();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        public void doSomething() throws FileNotFoundException {
            FileReader in = new FileReader("text.txt");
            System.out.println("Do something!");
        }
    }


