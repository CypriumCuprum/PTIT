import java.util.Scanner;
import java.lang.StringBuilder;
public class J03008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        for(int i=0;i<s.length();++i){
            if(s.charAt(i) == '1' || s.charAt(i) == '0' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
