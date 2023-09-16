import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger s1 = new BigInteger(scanner.next());
        BigInteger s2 = new BigInteger(scanner.next());
        System.out.println(s1.subtract(s2));

    }
}
