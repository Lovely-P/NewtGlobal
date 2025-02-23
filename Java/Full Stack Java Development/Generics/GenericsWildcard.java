import java.util.*;

class Vehicle1{
    private int id;
    public Vehicle1(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + '}';
    }
}

class Cars extends Vehicle1{
    private String model;

    public Cars(int id, String model) {
        super(id);
        this.model = model;
    }

}

public class GenericsWildcard {
    public static void main(String[] args) {
        List<Vehicle1> list = new ArrayList<>();
        list.add(new Vehicle1(1));
        list.add(new Vehicle1(2));
        list.add(new Vehicle1(3));
        list.add(new Vehicle1(4));
        list.add(new Cars(5, "S40"));
       GenericsWildcard.display(list);

    }
    public static void display(List<? super Vehicle1> list){//Inner bound(super) UpperBound(extends)
        for (Object data:list) {
            System.out.println(data);
        }
    }
}


