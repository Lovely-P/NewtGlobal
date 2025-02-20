
//Method Overloading

public class MethodOverloading {
    public int area(int height,int width){
        return height*width;
    }
    public int area(int side){
        return side*side;
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        int side=100000;
        System.out.println(m.area(side));
    }
}
