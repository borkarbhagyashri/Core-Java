import java.util.Scanner;
public class Numbercount{

  public static void display(int no,int end){
     if(no>end){
         return;
     }
    System.out.println(no);
    display(no+1,end);
     
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int no =sc.nextInt();
    System.out.println("enter the end number:");
    int end= sc.nextInt();
    display(no,end);
    
  }
}