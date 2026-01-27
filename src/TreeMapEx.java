import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Hello");
        map.put(99, "hii");
        map.put(90, "Bye");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        TreeSet treeSet = new TreeSet(map.keySet());
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Treeset : " + iterator.next());
        }
    }
}
