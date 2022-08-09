public class Selection_Sort {

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 21, 4, 54, 32, 77, 51, 29, 1, 5 };
        System.out.print("Unsorted Array: ");
        for (int element : arr) {

            System.out.print(element + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            if (min != 0)
                swap(arr, min, i);
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int element : arr) {

            System.out.print(element + " ");
        }
    }

}