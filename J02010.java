import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n-1;++i){
            int now = arr[i];
            for(int j=i+1;j<n;++j){
                if(arr[i] > arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j]  = c;
                }
            }
            System.out.print("Buoc ");
            System.out.print(i+1);
            System.out.print(": ");
            for(int j : arr){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
