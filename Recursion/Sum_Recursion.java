import java.util.Scanner;
 public class Sum_Recursion{
    public static int cal_Sum(int s,int e){
       if(s>e){
         return 0;
           }
       return s+cal_Sum(s+1,e);
     }
public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number:");
       int s = sc.nextInt();
       System.out.println("enter the end number:");
       int e = sc.nextInt();
       int sum=  cal_Sum(s,e);
       System.out.println(sum);
}
}
