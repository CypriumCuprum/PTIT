import java.util.Scanner;

public class J02022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        rs[0] = -1;
        while(t-- > 0){
            make(1, scanner.nextInt());
        }
    }

    public static int[] visited = new int[11];
    public static int [] rs = new int[11];
    public static int cnt =0;
    public static void printt(int n){
        for(int i=1;i<=n;++i){
            System.out.print(rs[i]);
        }
        System.out.println();
    }
    public static void make(int pos, int n){
        for(int i=1;i<=n;++i){
            if(visited[i] == 0){
                if(Math.abs(i-rs[pos-1]) != 1){
                    rs[pos] = i;
                    visited[i] = 1;
                    if(pos == n){
                        printt(n);
                    }
                    else{
                        make(pos+1,n);
                    }
                    visited[i] = 0;
                }
            }
        }
    }
}
