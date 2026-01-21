
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UniqueCharOfStr {

    public static void main(String[] args) {
        String input="programming";
        findUniqueCharacter(input);
    }

    public static void findUniqueCharacter(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        TreeMap<Character, Integer> characterIntegerTreeMap = new TreeMap<>(map);
        System.out.println("Unique Character");
        for(Map.Entry<Character, Integer>entry:characterIntegerTreeMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
