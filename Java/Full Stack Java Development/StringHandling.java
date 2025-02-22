public class StringHandling {
    public static void main(String[] args) {
        String a = "Lovely";
        String b = "Paul";
        String c = a.concat(b);
        System.out.println(c);
        if (c.equals("LovelyPaul")){
            System.out.println("LovelyPaul");
        }else {
            System.out.println("LovelyP");
        }
        System.out.println(c);
        System.out.println(c.replace("Paul", "Sarah"));



    }

}
