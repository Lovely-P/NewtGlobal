
class Data2<K extends Integer,V>{
    private K key;
    private V value;

    public Data2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public <N extends Number,E> void display(N number, E element){//N must be a number since it extends Number
        System.out.println("Number: "+number+ " Element: "+element);
    }
}

public class GenericsParameter2 {
    public static void main(String[] args) {
        Data2<Integer,String> data = new Data2<>(1, "Lovely");
        data.display(25.5254f,'p');


    }
}


