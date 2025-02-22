public class CallByReference {
    public static void main(String[] args) {
        String[] names = {"Tom", "Chaand", "Study", "Easy", "Raj"};
       // System.out.println(names);//Will print the address
        System.out.println(names[0]);
        CallByReference CV = new CallByReference();
        CV.displayNames(names);
        System.out.println("New value : "+names[0]);

    }
    void displayNames(String[] names){
        System.out.println(names[0]);
        names[0] = "John";
    }
}
