import java.util.Scanner;

public class perfect_number {

 public static boolean isPerfect(int num){
    int i=1;
    int sum =0;
    while(i<num){
        if(num%i==0){

            sum = sum+i;
        }
        i++;
    }
    if(num == sum){
     return true;
    }
    else{
        return false;
    }
   
 }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean perf = isPerfect(num);
        System.out.println(perf);
        
    }
    
}
