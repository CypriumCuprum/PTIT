import java.util.Scanner;

public class J01010 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- > 0){
            String s = in.next();
            String rs = "";
            boolean ok = true;
            for(int i= 0;i<s.length();++i)
            {
                if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                    if(rs.length()>=1) {
                        rs = rs + '0';
                    }
                }
                else if(s.charAt(i) == '1')
                {
                    rs = rs + '1';
                }
                else
                {
                    ok = false;
                    break;
                }
            }
            if(rs ==  "") {
                ok=false;
            }
            if(ok){
                System.out.println(rs);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }    
}
