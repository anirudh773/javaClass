public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 21, 4, 54, 32, 77, 51, 29, 1, 5 };
        System.out.print("Unsorted Array: ");
        for (int element : arr) {

            System.out.print(element + " ");
        }

        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int element : arr) {

            System.out.print(element + " ");
        }

    }
}
