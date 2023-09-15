import java.math.BigInteger;
import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            if(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8' && check1(s) && check2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean check1(String s){
        int sum = 0;
        for(int i=0;i<s.length();++i){
            sum += ((int)s.charAt(i)-48);
        }
        if(sum%10 == 0){
            return true;
        }
        return false;
    }

    public static boolean check2(String s){
        for(int i=0;i<s.length()/2+1;++i){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
