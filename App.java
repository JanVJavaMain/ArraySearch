public class App {
    static int[] arr1 = {0,0,0,0,0,0,0,0}; // hard coded arrays
    static int[] arr2 = {0,0,0,0,0,0,0,0};
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        /*
            arr1 = merge.getSortiertesArray1();
            arr2 = merge.getSortiertesArray2();
        */
        BinarySearch suche = new BinarySearch();
        suche.BinarySearchIterativ(arr1, 0, 0, 0);
        suche.BinarySearchIterativ(arr2, 0, 0, 0);
    }
}