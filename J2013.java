import java.util.Scanner;

public class J2013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        int run=1;
        while(true){
            boolean ok = false;
            for(int i=1;i<n-run;++i){
                if(arr[i] < arr[i-1]){
                    int c = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = c;
                    ok = true;
                }
            }
            System.out.println();
            if(!ok){
                break;
            }
            System.out.print("Buoc ");
            System.out.print(run);
            System.out.print(": ");
            for(int j = 0;j<n;++j){
                System.out.print(arr[j]);
                System.out.print(" ");
            }
            run++;
        }
    }
}