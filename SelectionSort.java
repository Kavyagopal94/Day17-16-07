public class SelectionSort {
    static void Sort(int[] arr) {
        int min = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i; // assuming minumium element
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,8,6,4,3,1};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
