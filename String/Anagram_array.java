import java.util.Scanner;
public class Anagram_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1");
        String s1 = sc.nextLine();
        System.out.println("Enter the String2");
        String s2 = sc.nextLine();
        String str = " ";

        boolean flag = true;
        if(s1.length()!=s2.length()){
            System.out.println("String is not Anagram");

        }
        else{

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int arr[] = new int[65535];

        for(int i=0 ; i<s1.length() ; i++){
            int ch = (int)s1.charAt(i);
            arr[65535-ch] = arr[65535-ch]+1;
            
        }

        for(int j=0 ; j<s2.length() ; j++){
            int ch = (int)s2.charAt(j);
            arr[65535-ch] = arr[65535-ch]-1;

        }

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                flag = false;
                System.out.println("not an anagram");
                break;
            }
        }
        if(flag==true){
            System.out.println("is anagram");
        }


    }
}

    
}
