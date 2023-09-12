import java.util.Scanner;

public class J01008 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int test_num = 1;
        while(test_num <= t){
            System.out.print("Test " + test_num + ": ");
            long n = in.nextLong();
            long k = 2;
            while(n>1){
                int power = 0;
                while(n % k == 0){
                    power ++;
                    n/=k;
                }
                if(power>0){
                    System.out.print(k + "("+ power + ") ");
                }
                k++;
            }
            test_num++;
            System.out.print("\n");
        }
    }
}
