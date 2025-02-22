public class CallByValue {
    public static void main(String[] args) {
        int value = 10;
        CallByValue cb = new CallByValue();
        System.out.println("CallByValue method : "+value);
        cb.displayValue(value);
        System.out.println("CallByValue method : "+value);

    }
    void displayValue(int value){

        System.out.println("Display method : "+value);
        value = 20;
        System.out.println("Display method : "+value);

    }
}
