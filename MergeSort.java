public class MargeSort {

    public static void Merge(int arr[], int l, int m, int r)
    {
        //starts with index 0 or l and ends at mid point +1 is added to specify since mid is a position
        int n1 = m - l + 1;
        //starts from mid+1 and ends at r
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //copying data to these temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        //merged array index
        int k = l;

        //Sorting and merging
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //copying remaining elements from L[] and R[] if left any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void Sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            Sort(arr, l, m);
            Sort(arr, m + 1, r);

            // Merge the halves and sorting
            Merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,8,6,8,4,3,1};

        Sort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
