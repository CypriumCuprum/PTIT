import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s1 = scanner.next();
            String s2 = scanner.next();
            BigInteger a1 = new BigInteger(s1);
            BigInteger a2 = new BigInteger(s2);
            BigInteger c = a1.subtract(a2);
            String rs = c.abs().toString();
            while(rs.length() < Math.max(s1.length(), s2.length())){
                rs = "0" + rs;
            }
            System.out.println(rs);
        }
    }
}
