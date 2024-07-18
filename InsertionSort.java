public class InsertionSort {

    static public void Sort(int[] arr) {
        int key=0;
        int j=0;
        for(int i=0; i<arr.length; i++) {
            j = i-1;
            key = arr[i];
            while(j >= 0 && arr[j] > key) { // in case of decsending order  arr[j]<key
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,8,6,4,3,1};
        Sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
