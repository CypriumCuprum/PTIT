import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            int [][] arr = new int[n][n];
            for(int i=0;i<n;++i){
                for(int j=0;j<n;++j){
                    arr[i][j] = scanner.nextInt();
                }
            } 
            int run=0;
            for(int i=0;i<n;++i){
                int inc = 1;
                if(i%2 == 0){
                    run = 0;
                    inc = 1;
                }
                else{
                    run = n-1;
                    inc = -1;
                }
                while(run>=0 && run<n){
                    System.out.print(arr[i][run]+" ");
                    run += inc;
                }
            }
            System.out.println();
        }
    }
}
