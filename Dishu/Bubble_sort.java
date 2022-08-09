
public class Bubble_sort {

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 21, 4, 54, 32, 77, 51, 29, 1, 5 };
        System.out.print("Unsorted Array: ");
        for (int element : arr) {

            System.out.print(element+" ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j])
                    swap(arr, j + 1, j);
            }
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int element : arr) {

            System.out.print(element+" ");
        }
    }
}
