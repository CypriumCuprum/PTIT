import java.util.Arrays;
import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int [] arr = new int[n+1];
            arr[0] = 0;
            int x;
            for(int i=1;i<=n;++i){
                x = scanner.nextInt();
                arr[i] = arr[i-1] + x;
            }
            int rs = -1;
            for(int i=2;i<n;++i){
                if(arr[i-1] == arr[n] - arr[i]){
                    rs = i;
                    break;
                }
            }
            System.out.println(rs);
        }
    }
}
