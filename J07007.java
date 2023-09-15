import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet{
    private SortedSet<String> set;
    public WordSet(String link) throws IOException{
        set = new TreeSet<>();
        Scanner scanner = new Scanner(new File(link));
        while(scanner.hasNext()){
            set.add(scanner.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String s = "";
        for(String i: set){
            s = s + i +"\n";
        }
        return s;
    }
}
