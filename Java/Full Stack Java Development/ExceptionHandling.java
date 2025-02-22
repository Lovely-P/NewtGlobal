public class ExceptionHandling {
    public static void main(String[] args) {
        int y = 0;
        try{
            System.out.println("Before Exception");
            int x = (y=10*10)/0;
            System.out.println("After Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println(y);
        }

    }
}
