import java.util.HashMap;
public class Anagram {
    public static void main(String[] args){
        HashMap<Character , Integer> hm = new HashMap<>();
        String Str1 = "Slient".toLowerCase();
        String Str2 = "Listen".toLowerCase();
        // String Str = " ";
        int flag =0;
        if(Str1.length()==Str2.length()){
            for(int i=0 ; i<Str1.length() ; i++){
                Character key1 = Str1.charAt(i);
                if(!hm.containsKey(key1)){
                    flag = 1;
                    break;
                }
                else{
                    hm.put(key1, hm.get(key1)+1);
                }
            }
            for(int i=0 ; i<Str2.length() ; i++){
                Character key2 = Str2.charAt(i);
                if(!hm.containsKey(key2)){
                    flag=1;
                    break;
                }
                else{
                    hm.put(key2, hm.get(key2)-1);
                }
            }
        }
        if(flag==1){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not Anagram");
        }

    }
}
