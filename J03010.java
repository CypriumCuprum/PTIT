import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> mp = new HashMap<String,Integer>(); 
        while(t-- > 0){
            String s = scanner.nextLine().trim();
            s = s.toLowerCase();
            String[] s1 = s.split("\\s+");
            String rs = "@ptit.edu.vn";
            String name_email = "";
            for(int i=0;i<s1.length-1;++i){
                name_email = name_email +s1[i].charAt(0);
            }
            name_email = s1[s1.length-1] + name_email;
            if(mp.containsKey(name_email)){
                mp.put(name_email, mp.get(name_email)+1);
                name_email = name_email + mp.get(name_email).toString();
            }
            else{
                mp.put(name_email, 1);
            }
            System.out.println(name_email+rs);
        }
    }
}
