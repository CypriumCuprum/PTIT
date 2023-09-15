import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File( "DATA.in"));
        int [] a = new int[1005];
        while(scanner.hasNextInt()){ // if reading a token is int will return TRUE
            a[scanner.nextInt()]++;
        }
        for(int i=0;i<1005;++i){
            if(a[i] > 0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
