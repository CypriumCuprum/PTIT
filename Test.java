import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int MAX = 1000005;
        boolean [] arr = new boolean[MAX+5];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i*i<=MAX;i++){
            if(arr[i]){
                for(int j=i*i;j<=MAX;j+=i){
                    arr[j] = false;
                }
            }
        }
        int [] ar1 = new int[MAX];
        int sar1 = 0;
        for(int i=2;i<MAX+5;++i){
            if(arr[i]){
                ar1[sar1++] = i;
            }
        }
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            long rs=0;
            for(int i=0;i<sar1&& (long)ar1[i]*ar1[i]<= n;++i)
            {
                while(n%ar1[i] == 0){
                    n/=ar1[i];
                }
                rs=ar1[i];
            }
            if(n>1){
                rs = n;
            }
            System.out.println(rs);
        }
    }
    
}
