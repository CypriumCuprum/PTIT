import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer [] arr = new Integer[n];
        Integer [] brr = new Integer[m];
        int x;
        
        for(int i=0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<m;++i){
            brr[i] =scanner.nextInt();
        }
        SortedSet<Integer> rs = new TreeSet<Integer>();
        rs.addAll(Arrays.asList(arr));
        rs.addAll(Arrays.asList(brr));
        for( Integer i : rs){
            System.out.print(i);
            System.out.print(" ");
        }
    }    
}
