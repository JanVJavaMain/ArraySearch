public class MergeSort {
    public MergeSort() {
        ErhebeDaten data = new ErhebeDaten();
        int[] arr1 = data.getArray1();
        int[] arr2 = data.getArray2();

        int[] sortiert1 = mergeSort(arr1, 0, arr1.length - 1);
        int[] sortiert2 = mergeSort(arr2, 0, arr2.length - 1);

        for (int val : sortiert1) {
            System.out.println(val + "");
        }
        for (int val : sortiert2) {
            System.out.println(val + "");
        }

        mergeZweiSortierteArrays(arr1, arr2);
    } 

    public static int[] mergeZweiSortierteArrays(int[] arr1, int[]arr2) {
        int[] sortiert = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sortiert[k] = arr1[i];
                k++;
                i++;
            } else {
                sortiert[k] = arr2[j];
                k++;
                j++;
            }
        }

        if (i == arr1.length) {
            while (j < arr2.length) {
                sortiert[k] = arr2[j];
                k++;
                j++;
            }
        }
        if ( j == arr2.length) {
            while (i < arr1.length) {
                sortiert[k] = arr1[i];
                k++;
                i++;
            }
        } 
        return sortiert; 
    } 

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            int[] br = new int[1];
            br[0] = arr[low];

            return br; 
        } 

        int middle = (low + high) / 2;

        int[] fh = mergeSort(arr, low, middle);
        int[] sh = mergeSort(arr, middle + 1, high);

        int[] sortiert = mergeZweiSortierteArrays(fh, sh);

        return sortiert; 
    }  

    /*
        public int[] getSortiertesArray1() {
            return mergeSort(arr1); 
        }
        public int[] getSortiertesArray2() {
            return mergeSort(arr2); 
        }
    */
}