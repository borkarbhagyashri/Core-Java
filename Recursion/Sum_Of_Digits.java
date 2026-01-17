import java.util.Scanner;
 public class Sum_Of_Digits{
     public static int cal_Sum(int s,int e,int add){
        if(s>e){
          return add;
            }

      add = add+s;
     return cal_Sum(s+1,e,add);

  }
     public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number:");
       int s = sc.nextInt();
       System.out.println("enter the end number:");
       int e = sc.nextInt();
     int sum=  cal_Sum(s,e,0);
     System.out.println(sum);

}
}