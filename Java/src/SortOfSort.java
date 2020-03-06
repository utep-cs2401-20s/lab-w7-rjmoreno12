public class SortOfSort {
    public static int[] sortOfSort(int[] arr) {
        int flipper = 0;
        int first = 0;
        int last = arr.length - 1;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
           int max = arr[findLargest(arr, last)]; //finds the index of the largest value in the array

            // If statement to add elements to end
            if (flipper < 2) {

                // Swapping the largest to the end
                temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
                flipper++;
                last--;
            }
            else if (flipper == 4) { //flips between the beginning and the end of the array
                flipper = 0;
            }
            else {
                // Swapping the largest with the first element for the next 2 times
                temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                first = first + 1;
                flipper++;
            }
        }
        print(arr);
        return arr;
    }

    public static int findLargest(int[] arr, int last) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        // Finds the largest value and the index of it
        for (int j = 0; j <= last; j++) {
            if (arr[j] >= max) {
                // Largest number
                max = arr[j];
                i = j;
            }
        }
        return i;
    }

    // Prints the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}