public class BinarySearch {
    static Object[] a = { "AP", "KA", "MH", "MP", "OR", "TN", "UP", "WB" };
    static Object key = "UP"; // The value we are searching for in the array
    public static void main(String args[]) {
        if (binarySearch())
            System.out.println(key + " found in the list");
        else
            System.out.println(key + " not found in the list");
    }
    static boolean binarySearch() {
        int c, mid, low = 0, high = a.length - 1; // (high) to the last index of array a.
        while (low <= high) {
            mid = (low + high) / 2;
            c = ((Comparable) key).compareTo(a[mid]);
            // (Comparable) key: Here, we are casting the variable key to the Comparable interface.
            // This allows us to call the compareTo() method on the key object.
            //a negative integer if the invoking object is less than the specified object,
            // zero if the invoking object is equal to the specified object, and
            // a positive integer if the invoking object is greater than the specified object.
            // This line compares the key with the element at the middle index mid of the array a.
            if (c < 0)
                high = mid - 1;
            else if (c > 0)
                low = mid + 1;
            else
                return true;
        }
        return false;
    }
}