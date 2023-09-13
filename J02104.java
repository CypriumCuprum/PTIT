import java.util.Scanner;

public class J02104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] graph = new int[n+1][n+1];
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j){
                graph[i][j] = scanner.nextInt();
            }
        } 
        for(int i=1;i<=n;++i){
            for(int j=i+1;j<=n;++j){
                if(graph[i][j] == 1){
                    printt(i, j);
                }
            }
        }
    }
    public static void printt(int a, int b){
        System.out.println("("+a+","+b+")");
    }
}
