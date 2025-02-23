import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("1", "Lovely");
        map.put("2", "Sarah");
        map.put("5", "Paul");
        map.put("0", "Faith");
        map.put("9", "Hope");

        for (String key: map.keySet()) {
            System.out.println("Key: "+key + " Value: "+map.get(key));
        }

        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
        }

        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,String > temp = entryIterator.next();
            System.out.println("Key: "+temp.getKey() + " Value: "+temp.getValue());
        }



    }
}


