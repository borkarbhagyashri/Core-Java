public class anagrams {
    public static void main(String[] args){
        String s1 = "lssten";
        String s2 = "silsno";
        String str = " ";
        int count = 0;
        int count1 = 0;
        char ch;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("is not anagram");
        }


        for(int i=0 ; i<s1.length() ; i++){
          
            ch = s1.charAt(i);
             

            if(str.indexOf(ch)!=-1){
                continue;
            }

            for(int j=0 ; j<s1.length() ; j++){
                if(ch==s1.charAt(j)){
                count++;
                }
            }


            for(int k=0 ; k<s2.length() ; k++){
                if(ch==s2.charAt(k)){
                    count1++;
                   
                }
            
                
            }
             break;
          
        }
       
        
        if(count == count1){
                System.out.println("is anagram");

            }else{
                System.out.println("is not anagram");
            }
        
    }
    
}

                                                                                                                                                                                                                                                                                                                               