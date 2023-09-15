import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        while(scanner.hasNextLine()){
            int t = Integer.parseInt(scanner.nextLine());
            ArrayList<MonHoc> list_subject = new ArrayList<>();
            while(t-- > 0){
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                String num = scanner.nextLine();
                MonHoc X = new MonHoc();
                X.set_in4(id, name, num);
                list_subject.add(X);
            }
            Collections.sort(list_subject);
            for(MonHoc i : list_subject){
                System.out.println(i);
            }
        }
        
    }

}
class MonHoc implements Comparable<MonHoc>{
    private String code, name, num;
    MonHoc(){}
    public void set_in4(String code, String name, String num){
        this.code = code;
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(MonHoc X){
        return this.name.compareTo(X.name);
    }

    @Override
    public String toString(){
        return this.code + " "+ this.name + " " + this.num;
    }

}
