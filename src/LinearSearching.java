public class LinearSearching {

    static Object[] a ={89, 45, 175, 7, 50, 43, 126, 90};
    static Object key = 126;
    public static void main(String[] args) {
        if(linearSearch()){
            System.out.println(key + " found in the list");
        }else{
            System.out.println(key + " not found in the list");
        }
    }
    static boolean linearSearch(){
        for(int i = 0; i<a.length; i++){
            if(key == a[i]){
                return true;
            }
        }
        return false;
    }
}
