import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int most = 0;
        for(int i=0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        int run = 0;
        boolean ok = true;
        for(int i=1;i<arr[n-1];++i){
            if(i == arr[run]){
                run++;
                continue;
            }
            else{
                System.out.println(i);
                ok = false;
            }
        }
        if(ok){
            System.out.println("Excellent!");
        }
    }
}
