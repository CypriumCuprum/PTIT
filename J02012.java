import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n;++i){
            int key = arr[i];
            int run = i-1;
            while(run>=0 && arr[run]>key){
                arr[run+1] = arr[run];
                arr[run] = key;
                run--;
            }
            System.out.print("Buoc ");
            System.out.print(i);
            System.out.print(": ");
            for(int j = 0;j<=i;++j){
                System.out.print(arr[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
