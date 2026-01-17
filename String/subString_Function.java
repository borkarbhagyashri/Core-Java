import java.util.Scanner;
public class subString_Function {
    public static String subString(int start,int end,String s) {
         
         String s1 = "";
         for(int i=start ; i<end ; i++){
            s1= s1+s.charAt(i);

         }

       
         return s1;
       
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         String s = sc.next();
         String subString_func = subString(0, 6, s);
         System.out.println(subString_func);

        
         
         

        
    }
    
}
