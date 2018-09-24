package pl.radox.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();
        // "Jan", 20 lat; "Adam", 35 lat; "Jan", 20 lat; "Jan", 20 lat; "Zofia", 41 lat.
        map.put("Jan", new Person("Jan", 20));
        map.put("Adam", new Person("Adam", 35));
        map.put("Jan", new Person("Jan", 20));
        map.put("Jan", new Person("Jan", 20));
        map.put("Zofia", new Person("Zofia", 41));

        System.out.println("Size of map: " + map.size());

        for (Map.Entry<String, Person> m : map.entrySet()) {
            System.out.println("Keys for map: " + m.getKey());
        }

        for (Map.Entry<String, Person> m : map.entrySet()) {
            System.out.println("Enters for map: " + m.getValue());
        }
        for (Map.Entry<String, Person> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }

        System.out.println("Map contains Adam's key: " + map.containsKey("Adam"));
        System.out.println("Value for Zofia's key: " + map.get("Zofia"));
        System.out.println(map.put("Adam", new Person("Adam", 41)));

        System.out.println(map.get("Bogdan"));


    }
}
