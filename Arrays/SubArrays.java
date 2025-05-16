package Arrays;

public class SubArrays {
    public static void SubArr(int arr[]) {
        // for start
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            // for one ahead of start till the end
            for (int j = i; j < arr.length; j++) {
                // for printing all no. between start to end ie. i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Sub arrays: " + total);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SubArr(numbers);
    }
}
