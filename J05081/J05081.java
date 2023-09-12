import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05081 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Thing> listthings = new ArrayList<>();
        Integer cnt = 1;
        while(cnt <= t){
            String name = scanner.nextLine();
            String unit = scanner.nextLine();
            int buy = Integer.parseInt(scanner.nextLine());
            int sell = Integer.parseInt(scanner.nextLine());
            Thing X = new Thing();
            String code = cnt.toString();
            for(int i=0;i<=3-code.length();++i){
                code = "0"+code;
            }
            code = "MH"+code;
            X.set_thing(code, name, unit, buy, sell);
            listthings.add(X);
            String zz = X.toString();
            cnt++;
        }
        Collections.sort(listthings);
        for(Thing i : listthings){
            System.out.println(i);
        }
    }   
}

class Thing implements Comparable<Thing> {
    private String code, name, unit;
    private int buy, sell;
    Thing(){}
    public void set_thing(String code, String name, String unit, int buy, int sell){
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }
    @Override
    public int compareTo(Thing X){
        return (X.sell - X.buy)-(this.sell - this.buy) ;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.unit + " " + this.buy + " " + this.sell + " " + (this.sell-this.buy);
    }

}
