import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> s = new Stack<>();
        Integer x;
        for(int i=0;i<n;++i){
            x = scanner.nextInt();
            if(!s.empty() && (x + s.peek())%2 == 0){
                s.pop();
            }
            else{
                s.push(x);
            }
        }
        int rs =0 ;
        while(!s.empty()){
            s.pop();
            rs++;
        }
        System.out.println(rs);
    }
}
