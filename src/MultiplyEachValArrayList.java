import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyEachValArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(50);

        List<Integer> collect = list.stream().map(val -> val * 5).collect(Collectors.toList());
        System.out.println("Using map : " + collect);

        list.forEach(l -> System.out.println("Using forEach: " + l * 5));

        //even no.

        List<Integer> even = list.stream().filter(val -> val % 2 == 0).collect(Collectors.toList());
        System.out.println("Even : " + even);

    }

}
