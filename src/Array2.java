import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        int []arr1={17,43,12,76,90};
        int []arr2={78,23,32,14,10};

        int[] mergedArray = mergeAndShort(arr1, arr2);

        System.out.println("Merged and sorted array: "+Arrays.toString(mergedArray));

    }

    public static int [] mergeAndShort(int[] array1, int[] array2){
        int totalLength = array1.length + array2.length;

        int[] mergedArray = new int[totalLength];
        System.arraycopy(array1, 0, mergedArray,0,array1.length);
        System.arraycopy(array2,0, mergedArray, array1.length, array2.length);

        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
