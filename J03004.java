import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String s = scanner.nextLine().trim();
            String[] arr = s.split("\\s+");
            String rs = new String();
            for(int i = 0;i<arr.length;++i){
                if(arr[i].length() == 1){
                    rs = rs + arr[i].toUpperCase();
                }
                else{
                    rs = rs+arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
                }
            }
            System.out.println(rs);
        }
    }
}
