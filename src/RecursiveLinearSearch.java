public class RecursiveLinearSearch {
    static Object[] a = { 89, 45, 175, 7, 50, 43, 126, 90 };
    static Object key = 43;
    public static void main(String[] args) {
        if(linearSearch(a.length -1)){
            System.out.println(key + " found in the list");
        }else{
            System.out.println(key + " not found in the list");
        }
    }  
    static boolean linearSearch(int n){
        if( n < 0){
            return false;
        }
        if(key==a[n]){
            return true;
        }else{
            return linearSearch(n-1);
        }
    }
}
