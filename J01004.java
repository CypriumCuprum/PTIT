import java.util.Scanner;

public class J01004 {
    public static void main(String []  args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            boolean ok = true;
            long n = in.nextLong();
            for(long i = 2; i*i<n; ++i){
                if(n%i == 0) {
                    ok = false;
                    break;
                }
            }
            if(n<=1) {
                ok =false;
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
