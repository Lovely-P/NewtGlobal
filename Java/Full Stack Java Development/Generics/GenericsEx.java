import java.util.*;

class Data{
    private Object object;

    public Data(Object object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return object.toString();
    }

//   public Object getObject() {
//        return object;
//    }
}
class Names{
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Lovely"));
        elements.add(new Data('£'));
        elements.add(new Data(25));
        elements.add(new Data(52.65));
        elements.add(new Data(new Names("StudyEasy")));
        System.out.println(elements);

        String x = new Data("Hello World").toString();
        System.out.println(x);

    }
}

