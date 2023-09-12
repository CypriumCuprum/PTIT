import java.util.Scanner;

public class J01009 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long giaithua = 1;
        long rs = 0;
        for(int i=1;i<=n;++i)
        {
            giaithua *=i;
            rs+=giaithua;
        }
        System.out.println(rs);
    }
}
