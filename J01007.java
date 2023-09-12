import java.util.Scanner;

public class J01007 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long [] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i=3;i<=92;++i){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        while(t-- > 0){
            long n = in.nextLong();
            int run=0;
            while(n > fibo[run] ){
                run++;
            }
            if(n != fibo[run]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }    
}
