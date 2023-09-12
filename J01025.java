import java.util.List;
import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] h1 = new int[4];
        int [] h2 = new int[4];
        for(int i=0;i<4;++i){
            h1[i] = scanner.nextInt();
        }
        for(int i=0;i<4;++i){
            h2[i] = scanner.nextInt();
        }
        int max_X = Math.max(h1[2], h2[2]);
        int min_X = Math.min(h1[0], h2[0]);
        int max_Y = Math.max(h1[3], h2[3]);
        int min_Y = Math.min(h1[1], h2[1]);
        int rs = Math.max(max_X-min_X,max_Y-min_Y);
        System.out.println(rs*rs); 

    }
}
