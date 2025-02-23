
  /*    T - Type
        E- Element
        K - Key
        N - number
        V - Value       */

class Data1<K, V>{
    private  K key;
    private  V value;

    public Data1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E, N> void  display(E element, N number){
        System.out.println("Element: "+element+ " Number: "+number);
    }

}

public class GenericsParameter {
    public static void main(String[] args) {
        Data1<Integer, String> data = new Data1(10, "Lovely");
        System.out.println("Key : "+data.getKey() + " Value: "+data.getValue());
        data.display("Test", 40);

    }

}


