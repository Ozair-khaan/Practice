public class FindSmallLargeInArray {

    public static void main(String[] args) {

        int[] arr = {12, 67, 21, 76, 45};
        int[] result = findSmLar(arr);

        System.out.println("Smallest elements : " + result[0]);
        System.out.println("Largest elements : " + result[1]);
    }

    public static int[] findSmLar(int[] arr) {

        int smallest = arr[0];
        int largest = arr[0];
        for (int value : arr) {

            if (smallest > value) {
                smallest = value;
            }
            if (largest < value) {
                largest = value;
            }

        }
        return new int[]{smallest, largest};
    }

}
