package Arrays.Collections.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static Map<Integer, String> mapCreation(Map<Integer,String> map){
        return map;
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "One");//adding key,values
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        Set<Integer> keys = map.keySet();
        for(Integer key: keys) {
            System.out.println(key + " " + map.get(key));
        }
        map.putIfAbsent(1,"one");//if it not present adding key,value
        System.out.println(map);
        Collection<String> values = map.values();
        for (String value: values) {
            System.out.println(value);
        }
        map.remove(1);//remove values
        System.out.println(map);
        map.replace(1,"zero");
        System.out.println(map.containsKey(2));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
