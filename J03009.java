import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String[] ss1 = s1.split("\\s+");
            String[] ss2 = s2.split("\\s+");
            SortedSet<String> sorted_set = new TreeSet<>();
            for(String s: ss2){
                sorted_set.add(s);
            }
            SortedSet<String> rs = new TreeSet<>();
            for(String s: ss1){
                if(sorted_set.add(s)){
                    rs.add(s);
                }
            }
            for(String i : rs){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
