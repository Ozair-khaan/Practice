import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount8 {
    public static void main(String[] args) {
        String s = "Amazon";
        Map<Integer, Long> collect = s.chars().mapToObj(c -> c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
