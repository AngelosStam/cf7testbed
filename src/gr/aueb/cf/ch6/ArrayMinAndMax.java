package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int min;
        int max;

        min = getMinPosition(arr);
        max = getMaxPosition(arr);
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded.
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length -1) return -1;

        int minPosition = low;
        int minValue = arr[low];

        for (int i = low; i < high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
