import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        String s = new String();
        ArrayList<String> rs = new ArrayList<>();
        while(scanner.hasNext()){
            try{
                s = scanner.next();
                int t = Integer.parseInt(s);
            }
            catch(NumberFormatException exception){
                rs.add(s);
            }
        }
        Collections.sort(rs);
        for(String i : rs){
            System.out.print(i+" ");
        }
    }
}
