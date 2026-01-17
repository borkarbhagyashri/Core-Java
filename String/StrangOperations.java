
public class StrangOperations {
    public static void main(String[] args) {
        int count=0;
        int count1=0;
        int count2=0;
        String s = "Bright Path@123";
        for(int i=0 ; i<s.length();i++){
             for(int ch ='A';ch<='z';ch++){
                if(s.charAt(i) == ch){
                count++;
            }
            else if(s.charAt(i) == 1 || s.charAt(i) == 2 || s.charAt(i) == 3){
                count1++;
               
            }
           
            else if(){
                count2++;
            }
            System.out.println(i);
        }
        
           

        }
    }
    
}
