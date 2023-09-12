import java.util.Scanner;

public class J01005 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int partition = in.nextInt();
            double height = in.nextDouble();
            double hei_1 = height/Math.sqrt((double)partition);
            int x = 1;
            while(x < partition){
                System.out.printf("%.6f",hei_1*Math.sqrt(x));
                System.out.print(" ");
                x++;
            }
            System.out.print("\n");
        }
    }
}
