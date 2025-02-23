
import java.util.*;

class Data3<K extends Integer,V extends String>{
    private K key;
    private V value;

    public Data3(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Data{" + "key=" + key + ", value=" + value + '}';
    }
}

public class SetComparator {
    public static void main(String[] args) {
        Comparator<Data3<Integer,String>> COMPARE_KEY = new Comparator<Data3<Integer, String>>() {
            @Override
            public int compare(Data3<Integer, String> obj1, Data3<Integer, String> obj2) {
                if (obj1.getKey() < obj2.getKey()){
                    return -1;
                }else if (obj1.getKey() > obj2.getKey()){
                    return 1;
                }
                return 0;
            }
        };

        Set<Data3<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
        set.add(new Data3<>(1,"Lovely"));
        set.add(new Data3<>(2,"Sarah"));
        set.add(new Data3<>(3,"Paul"));
        set.add(new Data3<>(4,"Hannah"));
        set.add(new Data3<>(1,"Hope"));
        set.add(new Data3<>(2,"Faith"));

        for (Data3 data: set) {
            System.out.println(data);
        }
    }
}


