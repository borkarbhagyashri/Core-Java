import java.util.Scanner;
public class String_replace {
    public static String replaceString(char oldchar , char newchar ,String s ){
        String s1 = "";
        
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==oldchar){
                s1=s1 + newchar;
            }
            else{
                s1=s1+s.charAt(i);
            }

        }
        return s1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Bright path";
        String replaceString_func = replaceString('B', 'W', s);
        System.out.println(replaceString_func);

        
    }
    
}
