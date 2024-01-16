//Jonathan tavarez Homework 9
import java.util.Arrays;
public class Problem2 {

    public static <E extends Comparable<E>>       
    int binarySearch(E[] a, E x){
    int start = 0;
    int end = a.length;
    int index = binarySearch1(a, x, start, end);
    return index;
}
 
public static <E extends Comparable<E>> 
int binarySearch1( E[] a, E x, int s, int e){
    if(s>e){
        return -1;
    }
        int mid = (s + e)/2;
        if(x.compareTo(a[mid]) < 0){
            return binarySearch1(a, x, s, mid-1);
        }
        if (x.compareTo(a[mid]) > 0){
            return binarySearch1(a, x, mid+1, e);
        }
        if (x.compareTo(a[mid]) == 0){
            return mid;
        }
      return -1;
        }

    public static void main(String[] args) {
        String[] arr = { "boom", "array", "ass", "cat", "lego", "apple", "wesley", "Justin"};
         Arrays.sort(arr);
        System.out.println(binarySearch(arr,"hi"));
         System.out.println(binarySearch(arr,"cat"));
          System.out.println(binarySearch(arr,"lego"));
        
        }
}      
