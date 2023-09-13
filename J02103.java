import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int cnt = 1;
        while(cnt <= t){
            System.out.println("Test "+cnt + ":");
            int n = scanner.nextInt(), m = scanner.nextInt();
            int [][] arr = new int[n][m];
            int [][] cvi = new int[m][n];
            for(int i=0;i<n;++i){
                for(int j =0;j<m;++j){
                    arr[i][j] = scanner.nextInt();
                    cvi[j][i] = arr[i][j];
                }
            }
            int [][] rs = new int[n][n];
            for(int i=0;i<n;++i){
                for(int j=0;j<n;++j){
                    rs[i][j] = 0;
                    for(int h=0;h<m;++h){
                            rs[i][j] += arr[i][h]*cvi[h][j]; 
                    }
                    System.out.print(rs[i][j]+" ");
                }
                System.out.println();
            }
            cnt++;
        }
    }
}
