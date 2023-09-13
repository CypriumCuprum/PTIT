import java.util.Scanner;

public class J02020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        rs[0] = 0;
        make(1,n,k);
        System.out.println("Tong cong co "+cnt+" to hop");
    }
    public static int[] visited = new int[100];
    public static int [] rs = new int[100];
    public static int cnt =0;
    public static void printt(int k){
        for(int i=1;i<=k;++i){
            System.out.print(rs[i]+" ");
        }
        System.out.println();
    }
    public static void make(int position,int n,int k){
        for(int i=rs[position-1]+1;i<=n;++i){
            rs[position] = i;
            if(position == k){
                printt(k);
                cnt++;
            }
            else{
                make(position+1,n,k);
            }
        }
    }
}
