public class RecursiveBinarySearch {
    static Object[] a = { "AP", "KA", "MH", "MP", "OR", "TN", "UP", "WB" };
    static Object key = "XP";
    public static void main(String args[]) {
        if (binarySearch(0, a.length - 1))
            System.out.println(key + " found in the list");
        else
            System.out.println(key + " not found in the list");
    }
    static boolean binarySearch(int low, int high) {
        if (low > high)
            return false;
        int mid = (low + high) / 2;
        int c = ((Comparable) key).compareTo(a[mid]);
        if (c < 0)
            return binarySearch(low, mid - 1);
        else if (c > 0)
            return binarySearch(mid + 1, high);
        else
            return true;
    }
}