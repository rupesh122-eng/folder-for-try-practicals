import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Hashing  {

    public static void main(String[] args) {
        //Hashset
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(1);

        if (set.contains(2)) {
            System.out.println("yes it contains");
        }

        if (!set.contains(4)) {
            System.out.println("NO it doesnot contains");
        }

        System.out.println(set.size());

        System.out.println(set);

        // Iterator
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 182);
        map.put("Nepal", 120);
        map.put("China", 150);
        System.out.println(map);

        map.put("China", 160);
        System.out.println(map);

        // Searcing
        if(map.containsKey("China")) {
            System.out.println("Present in map");
        } else {
            System.out.println("Not present in map");
        }

        System.out.println(map.get("Nepal"));
        System.out.println(map.get("Pakistan"));


        //Iteration (1)
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);
    }
}