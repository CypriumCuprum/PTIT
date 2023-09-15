import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.IN"));
        while( scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
