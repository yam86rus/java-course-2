package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Maxim");
        map1.put(1100, "Nikolay");
        map1.put(1200, "Sergey");
        map1.put(1300, "Olga");
        map1.putIfAbsent(1000, "Olga");
        map1.put(null,"Batman");
        System.out.println(map1);
//        System.out.println(map1.get(110));
        map1.remove(1000);
        System.out.println(map1);
        System.out.println(map1.containsValue("Olga"));
        System.out.println(map1.containsKey(1200));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
