import java.math.BigInteger;
import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            long rs = 1;
            for(long i=2;i<=n;++i){
                rs = lcd(rs, i);
            }
            System.out.println(rs);
        }
    }

    public static long gcd(long x, long y){
        if( y == 0) return x;
        return gcd(y,x%y);
    }

    public static long lcd(long x, long y){
        return (x*y)/gcd(x, y);
    }
}
