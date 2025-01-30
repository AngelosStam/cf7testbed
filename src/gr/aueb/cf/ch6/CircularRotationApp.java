package gr.aueb.cf.ch6;

public class CircularRotationApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Initial Array");
        print(arr);
        System.out.println();

        int[] leftRotated = doCircularLeftShiftBy(arr, 2);
        System.out.println("Left Rotated by 2");
        print(leftRotated);
        System.out.println();

        int[] rightRotated = doCircularRightShiftBy(arr, 3);
        System.out.println("Right Rotated by 3");
        print(rightRotated);
    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        for (int item : arr)
            System.out.print(item + " ");
    }

}
