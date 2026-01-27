import java.util.Arrays;
import java.util.Comparator;

public class DemoEx {

//    Java Program to Sort Items By Weight
//
//    Input: items = [“Laptop”, “TV”, “Phone”, “Watch”]
//
//    weights = [500, 1000,250, 50]
//
//    Output: [“TV”, “Laptop”, “Phone”, “Watch”]

//          List list=  Arrays.asList(500, 1000,250, 50);
//
//        //Collections.sort(list);
//
//   Map<Integer, String> map=new TreeMap(weight, items);
//   map.


    public static void main(String[] args) {
        String[] items = {"Laptop", "TV", "Phone", "Watch"};
        Integer[] weights = {500, 1000, 250, 50};

        Integer[] indices = new Integer[weights.length];
        for (int i = 0; i < weights.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return weights[i2] - weights[i1];
            }
        });

        String[] sortedItems = new String[items.length];
        for (int i = 0; i < indices.length; i++) {
            sortedItems[i] = items[indices[i]];
        }
        System.out.println(Arrays.toString(sortedItems));
    }

}
