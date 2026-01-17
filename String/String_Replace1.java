
public class String_Replace1 {    
    public static void main(String[] args) {
        String s= "Bhagyashri Uttam Bhanudas Martand Maruti Borkar ".trim();
        String s1="";
        int end = s.length();  
        int space = 0;
        int start = 0;

        for(int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)==' '){
                s1 = s1 + s.substring(i,end)+' ';
                end = i+1;
            }
            else if(i==0){
                s1 = s1 +(s.substring(i,end));
            }
        }
        System.out.println(s1.trim());
        
    }
    
}
