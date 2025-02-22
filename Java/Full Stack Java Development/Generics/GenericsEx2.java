
class GenericData<T>{
    private T data;
    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
public class GenericsEx2 {
    public static void main(String[] args) {
        GenericData<String> genericData = new GenericData<>("Some generic data");
        String y = genericData.getData();
        System.out.println(y);
    }
}
