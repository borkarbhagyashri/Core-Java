import java.util.Scanner;
public class Anagram_from_abss{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1:");
        String s1 = sc.nextLine();
        System.out.println("enter the string2:");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
         
        String str =" ";
        char ch;
        boolean flag = true;

        if(s1.length()!=s2.length()){
            System.out.println("String is not anagram");
        }
        else{

        for(int i=0 ; i<s1.length() ; i++){
            int count1=0;
            int count2=0;
            ch = s1.charAt(i);

            for(int j=0 ; j<s1.length() ; j++){
                if(ch==s1.charAt(j)){
                    count1++;
                }
            }

            for(int k=0 ; k<s2.length() ; k++){
                if(ch==s2.charAt(k)){
                    count2++;
                }
            }
              if(count1!=count2){
                flag=false;
                System.out.println("is not anagram");
                break;
            }

           

            


        }
        if(flag==true){
           System.out.println("is  anagram"); 
        }
        

        }

         
    }
}


