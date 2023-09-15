import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        int rs = 0;
        for(int i=0;i<n;++i){
            int cnt = 0;
            for(int j=0;j<3;++j){
                x = scanner.nextInt();
                if(x == 1) {
                    cnt++;
                }
            }
            if(cnt >= 2){
                rs++;
            }
        }
        System.out.println(rs);
    }
}
