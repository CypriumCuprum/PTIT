import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class J02007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Integer test = 1;
        while(test <= t){
            System.out.print("Test "+test.toString()+":");
            System.out.println();
            test++;
            int n = scanner.nextInt();
            int [] arr = new int[100000];
            List<Integer> tt = new ArrayList<Integer>();
            Arrays.fill(arr, 0);
            int x;
            for(int i=0;i<n;++i){
                x = scanner.nextInt();
                if(arr[x] == 0){
                    tt.add(x);
                }
                arr[x]++;
            }
            for(Integer i : tt){
                System.out.print(i.toString()+" xuat hien ");
                System.out.print(arr[i]);
                System.out.println(" lan");
            }
        }
    }
}
