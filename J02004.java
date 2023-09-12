import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            boolean ok = true;
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;++i){
                arr[i] = scanner.nextInt();
            }
            for(int i=0;i<n/2+1;++i){
                if(arr[i] != arr[n-1-i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
