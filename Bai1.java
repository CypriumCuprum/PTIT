import java.util.Scanner;

public class Bai1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            if(s.endsWith("86"))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
    
}
