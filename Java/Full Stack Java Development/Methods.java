public class Methods {
    public static void main(String[] args) {
        loop(1,10);
        System.out.println();
        loop(-10,0);
        int area = areaOfRectangle(10,15);
        System.out.println(area);

    }
    public static int areaOfRectangle(int height, int width){
        return height*width;
    }

    public static void loop(int start, int stop){
        for (; start <= stop; start++) {
            System.out.print(start);
        }
    }

}
