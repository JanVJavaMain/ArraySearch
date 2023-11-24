public class BinarySearch {
    public int BinarySearchRekursiv(int[] sortiertesArray, int key, int low, int high) {
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }
        if (key == sortiertesArray[middle]) {
            return middle; 
        } else if (key < sortiertesArray[middle]) {
            return BinarySearchRekursiv(sortiertesArray, key, low, middle - 1);
        } else {
            return BinarySearchRekursiv(sortiertesArray, key, low, middle - 1);
        }
    }

    public int BinarySearchIterativ(int[] sortiertesArray, int key, int low, int high){
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (sortiertesArray[mid] < key) {
                low = mid + 1;
            } else if (sortiertesArray[mid] > key) {
                index = mid; 
                break;
            }
        }
        System.out.println("Gefunden bei:" + index);
        return index; 
    } 
}