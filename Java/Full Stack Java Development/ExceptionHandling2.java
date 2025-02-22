public class ExceptionHandling2 {
        public static void main(String[] args) {
            ExceptionHandling2 eh = new ExceptionHandling2();
            try {
                eh.doSomething();
            }finally {
                System.out.println("Exception is Caught");
            }
        }
        public void doSomething() throws RuntimeException {
            String x = "One";
            if (x.equals("zero")){
                throw new RuntimeException();
            }
            System.out.println("Do something!");
        }
}


